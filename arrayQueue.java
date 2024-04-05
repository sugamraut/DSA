import java.util.Scanner;

class MyQueue {
    int front, rear, arr[];

    public MyQueue(int size) {
        front = rear = -1;
        arr = new int[size];
    }

    public boolean isFull() {
        return front == (rear + 1) % arr.length;
    }

    public boolean isEmpty() {
        return (front == -1) && (rear == -1);
    }

    public void enqueue(int el) {
        if (isEmpty()) {
            front++;
            rear++;
            arr[rear] = el;
        } else if (isFull()) {
            System.out.println("Queue is full!!!!!!");
        } else {
            rear = (rear + 1) % arr.length;
            arr[rear] = el;
        }
    }
    //Algorithm:
    /*  1.Start
        2.If queue is empty.
            2.1 increment front and rear by 1.
            2.2 insert element into the array in index value equivalent to rear.
            2.3 goto 5
        3.if queue is full
            3.1 print queue is full
            3.2 goto 5
        4. if queue is neither empty nor full
            4.1 set front =(front+1)%sizeofarray
            4.2 insert element into the array in index value equivalent to rear.
            4.3 goto 5
        5. Stop

            */
    public Integer dequeue() {
        Integer dequeued_el = null;
        if (isEmpty()) {
            System.out.println("Queue is empty!!!!");
        } else if (front == rear) {
            dequeued_el = arr[front];
            front = rear = -1;
        } else {
            dequeued_el = arr[front];
            front = (front + 1) % arr.length;

        }
        return dequeued_el;
    }

    public int getFront() {
        return arr[front];
    }

    public int getRear() {
        return arr[rear];
    }

}

class QueueDemo {
   public static void main(String[] args) {
       MyQueue q = new MyQueue(5);
       Scanner sc = new Scanner(System.in);
       while(true){
           System.out.println("1.Enqueue\t2.Dequeue\t3.Print\t4.Exit");
           System.out.print("Enter your choice:");
           char choice=sc.next().charAt(0);
           switch (choice){
               case '1':
                   System.out.print("Enter value to enqueue:");
                   int x=sc.nextInt();
                   q.enqueue(x);
                   System.out.println("Insertion successful.");
                   break;
               case '2':
                   q.dequeue();

                   break;
               case '3':
                   System.out.println("1.Print first\t2.Print last");
                   char ch=sc.next().charAt(0);
                   switch (ch){
                       case '1':
                           System.out.println(q.getFront());
                           break;
                       case '2':
                           System.out.println(q.getRear());
                           break;
                   }
                   break;
               case '4':return;
               default:
                   System.out.println("Wrong Value given!");
           }
       }
   }
}