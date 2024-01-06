 class Node{
    int data;
    Node next;
 
 public Node(int data){
this.data=data;
this.next=null;
 }
 public Node(int data,Node next){
    this.data=data;
    this.next=next;
 }
}
 class sLinkedlist {
Node head,tail;
public boolean isempty(){
    return(head==null)&&(tail==null);
}
public void insertAttail(int data){
    if(isempty()){
        head=tail=new Node(data);
    }
    else{
        tail=tail.next=new Node(data);
    }
}
 public void insertAtHead(int el) {
        if (isempty()) {
            head = tail = new Node(el);
            System.out.println("the node is created");
        } else {
            head = new Node(el, head);
            System.out.println("the node is created");

        }
    }
public void deleteAthead(int data){
    if (isempty()) {
        System.out.println("you can delete the data");
        
    }
    else if(head==tail){
        head=tail=null;

    }
    else{
        head=head.next;
    }
}
public void deleteAttail(int value){
    if(isempty()){
        System.out.println("cannot be delete");
        return ;
    }
    else if(head==tail){
head=tail=null;
    }
    else{
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
            temp.next=null;
            tail=temp;
        }
    }
}
public void printAll(){
    Node trip=head;
    while (trip!=null) {
        System.out.println(trip.data);
        trip=trip.next;
        
    }
}
    
}
class demo1{
    public static void main(String[] args) {
        sLinkedlist ll=new sLinkedlist();
        ll.insertAtHead(2);
        ll.insertAttail(33);
        ll.deleteAthead(2);
        ll.deleteAttail(33);
        
    }
}
