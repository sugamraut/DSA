//import java.util.Scanner;
class CSNode{
    Integer data;
    CSNode next;
   public CSNode(int data){
        this.data=data;
        this.next=null;
    }
    public CSNode(int data,CSNode next){
        this.data=data;
        this.next=next;
    }
}
class CircularSingly {
    CSNode head,tail;
    public boolean isEmpty(){
        return (head==null)&& (tail==null);
    }

    public void insertAtHead(int el){
        if(isEmpty()) {
            tail= head = new CSNode(el);
            head.next=tail;
        }
        else {
            head = new CSNode(el,head);
            tail.next=head;
        }
        System.out.println("Insertion successfull.");
    }
    public void insertAtTail(int val){
        if(isEmpty()){
            tail=head=new CSNode(val);
            tail.next=head;
        }
        else {
           tail=tail.next=new CSNode(val,head);
           tail.next=head;
        }
        System.out.println("Insertion successfull.");
    }
    public void deleteAtHead(){
        if(isEmpty()){
            System.out.println("Cant do");
            return;
        }
        else if(head==tail){
            head=tail=null;
        }
        else{
           head=head.next;
           tail.next=head;
        }
        System.out.println("Deletion successfull.");
    }
    public void deleteAtTail(){
        if(isEmpty()){
            System.out.println("Cant do");
            return;
        }
        else if(head==tail){
            head=tail=null;
        }
        else{
            CSNode tmp=head;
            while(tmp.next!=tail){
                tmp=tmp.next;
            }
            tmp.next=head;
            tail=tmp;
            tail.next=head;
        }
        System.out.println("Deletion successfull.");
    }
    public void insertAtRandom(int pos,int element) {
        if (isEmpty()) {
            insertAtHead(element);

        } else if (head == tail) {
            if(pos ==0) {
                insertAtHead(element);
            }
            else
                insertAtTail(element);
        }
        else {
            CSNode tmp = head;
            CSNode prev = head;
            for (int i = 0; i < pos; i++) {
                prev = tmp;
                tmp = tmp.next;
            }
            prev.next = new CSNode(element, tmp);
        }
        System.out.println("Insertion successfull");
    }

    public void deleteAtRandom(int pos)
    {
        if(head==null && tail==null){
            System.out.println("Cannot delete, Its null");
            return;
        }
        else if(head  == tail){
            deleteAtHead();
        }
        else{
            CSNode tmp=head;
            CSNode prev = head;
            for(int i=0;i<pos;i++){
                prev=tmp;
                tmp=tmp.next;
            }
            prev.next=tmp.next;
        }
        System.out.println("Deletion successfull");
    }
    public void printAll(){
        if(isEmpty())
            System.out.println("Cannot print, its empty!");
        else {
            System.out.println("All data:");
            CSNode tmp = head;
            do{
                System.out.println(tmp.data);
                tmp = tmp.next;
            }while(tmp != head);
        }
    }
public void search(int val) {
    CSNode tmp = head;
    boolean con = false;
    do {
        if (tmp.data == val) {
            con = true;
        }
        tmp = tmp.next;
    }while (tmp != head);
        if (con == true)
            System.out.println("Found");
        else
            System.out.println("Not found");
    }
}
class demo14{
    public static void main(String[] args) {
        CircularSingly c= new CircularSingly();
        c.insertAtHead(3);
        c.insertAtHead(5);
        c.insertAtTail(6);
        c.insertAtTail(2);
        c.printAll();
    }
}