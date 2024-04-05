import java.util.Scanner;

class Queue {
    int front =-1,rear=-1;
    int[] arr=new int[5];
    public boolean isEmpty(){
        return (front==-1&&rear==-1);
    }
    public boolean isFull(){
        return rear==arr.length-1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Cannot add, Queue is full.");
            return;
        }
        if(isEmpty()){
            rear+=1;
            front+=1;
            arr[rear]=data;
        }
        else{
            rear++;
            arr[rear]=data;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        else{
            front+=1;
            System.out.println("Deletion successful.");
        }
    }
    public void printAll(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
        }
        else{
            int a=front;
            do{
                System.out.println(arr[a]);
                a++;
            }while(a<=rear);
        }
    }
    public void printFront(){
        System.out.println(arr[front]);
    }
     public void printRear(){
         System.out.println(arr[rear]);
     }
}
class Demo1{
    public static void main(String[] args) {
        Queue q=new Queue();
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
                    System.out.println("1.Print first\t2.Print last\t3.Print all");
                    char ch=sc.next().charAt(0);
                    switch (ch){
                        case '1':
                             q.printFront();
                             break;
                        case '2':
                                q.printRear();
                                break;
                        case '3':
                            System.out.println("All data:");
                            q.printAll();
                            break;
                    }
                    break;
                case '4':return;
            }
        }
    }
}
