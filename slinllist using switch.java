
import java.util.Scanner;

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {

    Node head, tail;

    public boolean isEmpty() {
        return (head == null) && (tail == null);
    }

    public void insertAtTail(int data) {
        if (isEmpty()) {
            head = tail = new Node(data);
            System.out.println("the node is created");
        } else {
            tail = tail.next = new Node(data);
//            tail=tail.next;(Alternate method)
            System.out.println("the node is created");
        }

    }

    public void insertAtHead(int el) {
        if (isEmpty()) {
            head = tail = new Node(el);
            System.out.println("the node is created");
        } else {
            head = new Node(el, head);
            System.out.println("the node is created");

        }
    }

    public void printAll() {
        Node tmp;
        tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    public void merge(LinkedList list2) {
        tail.next = list2.head;
        tail = list2.tail;
    }

    public void DelAtHead() {
        if (isEmpty()) {
            System.out.println("the linkedlist is empty");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void DelAtTail() {
        if (isEmpty()) {
            System.out.println("the linkedlist is empty");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
                tmp.next = null;
                tail = tmp;
            }
        }
    }
    // public void search(int position){
    //     Node prev,tmp=head;
    //     for(int i=0;i<position;i++){
    //         prev=tmp;
    //         tmp=tmp.next;
    //     }
    //     prev.next=new Node(el,tmp);
        
    // }

}

class Demo_Linked_List {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        LinkedList l2=new LinkedList();
       /*  l.insertAtHead(9);
        l.insertAtTail(10);
        l.insertAtTail(11);
        LinkedList l2 = new LinkedList();
        l2.insertAtHead(10);
        l2.insertAtTail(2);
        l2.insertAtHead(3);
        l.merge(l2);
        l.printAll();
        */
        while (true) {
            
        
        System.out.println("enter the value\n 1.insert the value \n 2.Delete the data \n3.printAll \n4:merge\n5:exit");
        System.out.println("enter the choice element");
        Scanner sc=new Scanner(System.in);
        
        int choice=sc.nextInt();
        
        switch (choice) {
            case 1: { System.out.println("enter 1. insert at head\n 2.insert tail \n 3.exit");
                     int n=sc.nextInt();
                     switch (n) {
                        case 1:
                        System.out.println("enter the value for inserting at head:");
                             int x=sc.nextInt();
                              l.insertAtHead(x);
                            
                            break;
                            
                        case 2:
                             System.out.println("enter the value for inerting at tail:");
                              int y=sc.nextInt();
                              l.insertAtTail(y);
                            
                            break;
                        case 3:
                               return ;
                     
                        default:
                         System.out.println("no such result found");
                            break;
                     }
                    }
                
                break;
            case 3:
                  System.out.println("Data is printed ");
                    l.printAll();
                    return;
            
            case 2:
               System.out.println("enter \n1.delete the data form Head \n2.Delete the data from tail\n3.exit");
               int n=sc.nextInt();
               switch (n) {
                case 1: System.out.println("Deleted data from head");
                       l.DelAtHead();
                    
                    break;
                    case 2:System.out.println("Dleted data from Tail");
                    l.DelAtTail();
                    break;
                    case 3: 

                    return ;
               
                default:
                    break;
               }

               case 4:  
               l.merge(l2);
               break;

                case 5:
                return ;
        
            default:
                break;
            
             
            }
         }


         
          
         
    }

}
