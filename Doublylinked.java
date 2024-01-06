class Node{
    Integer data;
    Node next,prev;
  public Node(Node prev,int data,Node next){
    this.data=data;
    this.prev=prev;
    this.next=next;
  }  
}
public class Doublylinked {
    Node head,tail;
    public boolean isempty(){
        return((head==null)&&(tail==null));
    }
    public void insertAtHead(int el){
        if (isempty()) {
            head=tail=new Node(null, el, null);
            
        }
        else{
        
            head.prev=new Node(null, el, null);
            head=head.prev;
        }
    }
        public void insertAttail(int el){
            if (isempty()) {
                head=tail=new Node(null,el,null);
                
            }
            else{
                tail.next=new Node(tail, el, null);
                tail=tail.next;
            }
            
        }
        public void printForwad(){
      Node temp=head;
      while (temp!=null) {
        System.out.println(temp.data);
        temp=temp.next;
        
      }
            }
            public void printreverse(){
                 Node temp=tail;
                 while (temp!=null) {
                    System.out.println(temp.data);
                    temp=temp.prev;
                    
                 }
            }
    
    
}

class Demo{
    public static void main(String[] args) {
        Doublylinked d=new Doublylinked();
        d.insertAtHead(4);
        d.insertAttail(5);
        d.printForwad();
        d.printreverse();
    }
}
