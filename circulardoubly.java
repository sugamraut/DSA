class CDNode{
    Integer data;
    CDNode prev,next;
    public CDNode(int data){
        this.prev=null;
        this.data=data;
        this.next=null;
    }
     public CDNode(CDNode prev,int data,CDNode next){
        this.data=data;
        this.next=next;
        this.prev=prev;

    }
}
public class circulardoubly {
    CDNode head,tail;
    public boolean isEmpty(){
        return (head==null)&&(tail==null);
    }
    public void insertAtHead( int el){
        if (isEmpty()) {
           head=tail=new CDNode(el); 
        }
        else{
            head =new CDNode(tail,el,head);
            head.next.prev=head;
            tail.next=head;

        }
    }
    public void insertAtTail( int el){
        if (isEmpty()) {
            head=tail=new CDNode( el);
            
        }
        else{
            tail=new CDNode(tail, el, head);
            tail.prev.next = tail;
            head.prev=tail;
        }
    }
    public void printforward (){
        CDNode temp=head; 
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }while(temp!=tail.next);
    }
    public void printbackward(){
        CDNode temp =tail;
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
