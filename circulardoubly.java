class Node{
    Integer data;
    Node prev,next;
    Node(Node prev,int data,Node next){
        this.data=data;
        this.next=next;
        this.prev=prev;

    }
}
public class circulardoubly {
    Node head,tail;
    public boolean isEmpty(){
        return (head==null)&&(tail==null);
    }
    public void insertAtHead( int el){
        if (isEmpty()) {
           head=tail=new Node(null,el,null); 
        }
        else{
            head =new Node(tail,el,head);
            head.next.prev=head;
            tail.next=head;

        }
    }
    public void insertAtTail( int el){
        if (isEmpty()) {
            head=tail=new Node(null, el, null);
            
        }
        else{
            tail=new Node(tail, el, head);
            tail.prev.next = tail;
            head.prev=tail;
        }
    }
    public void printforward (){
        Node temp=head; 
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }while(temp!=tail.next);
    }
    public void printbackward(){
        Node temp =tail;
        do{
            System.out.println(temp.data);
        temp=temp.prev;
        }while(temp!=head.prev);
    }
}
class circulardoubly1{
    public static void main(String[] args) {
        circulardoubly c=new circulardoubly();
        c.insertAtHead(5);
        c.insertAtHead(6);
        c.insertAtHead(7);
        c.insertAtTail(1);
        c.insertAtTail(2);
       c.printforward();
       System.out.println("hi");
       c.printbackward();
       //c.printforward();
       
       
    }
}
