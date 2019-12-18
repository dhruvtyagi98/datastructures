package dll;
public class DLL {
    Node head;
    public class Node{
        int data;
        Node next,prev;
        Node(int d){
            data=d;
            next=prev=null;
        }
    } 
    public void insert(int d){
        Node newNode=new Node(d);
        newNode.next=head;
        newNode.prev=null;
        
        if(head!=null)
            head.prev=newNode;
        
        head=newNode;
    }
    public void delete(Node list,int k){
        Node currnode=list,b=null;
        if(currnode!=null&&currnode.data==k){
            head=currnode.next;
            return;
        }
        while(currnode!=null&&currnode.data!=k){
            b=currnode;
            currnode=currnode.next;
        }
        if(currnode!=null){
            b.next=currnode.next;
            currnode.next.prev=b;
        }
        if(currnode==null)
            System.out.println(k+" not found");
    }
    public void print(Node node){
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }
    public static void main(String[] args){
        DLL list=new DLL();
          list.insert(50);
          list.insert(60);
          list.insert(10);
          list.insert(20);
          list.insert(40);
          list.print(list.head);
          System.out.println();
          list.delete(list.head,10);
          list.print(list.head);
    }
    
}
