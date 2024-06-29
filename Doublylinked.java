class DNode {
    Integer data;
    DNode next, prev;

public DNode(int data){
    this.next=null;
    this.prev=null;
    this.data=data;
}
    public DNode(DNode prev, int data, DNode next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
public class Doublylinked {
    DNode head,tail;

    public boolean isEmpty() {
        return (head == null && tail == null);
    }

    public void insertAtHead(int el) {
        if (isEmpty()) {
            head = tail = new DNode( el);
        } 
        else {
            head.prev = new DNode(null, el, head);
            head = head.prev;
        }
    }

    public void insertAtTail(int el) {
        if (isEmpty()) {
            head = tail = new DNode( el);
        } else {
            tail.next = new DNode(tail, el, null);
            tail = tail.next;
        }
    }

    public void printForward() {
        DNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void printReverse() {
        DNode temp = tail;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        Doublylinked d = new Doublylinked();
        d.insertAtHead(4);
        d.insertAtTail(5);
        d.printForward();
        System.out.println("Print reverse:");
        d.printReverse();
    }
}















