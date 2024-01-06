import java.util.Scanner;


class AStack {
    int arr[] = new int[3];
    int count = -1;
    public void push(int el) {
        if(count==arr.length-1) {
            System.out.println("Stack Overflow");
        } else {
            count++;
            arr[count] = el;
        
        }
    }
    
    public void pop () {
        if(count == -1) {
            System.out.println("Stack Underflow");
        } else {
            count--;
        }
    }
    
    public void peek() {
        System.out.println(arr[count]);
    }
}

    class StackByArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AStack st = new AStack();
        System.out.println("Stack Interface\n---------------------------\nSpecialty: We use arrays");
        char op;
        do{
            System.out.println("\nChoose your weapon:\n1.Push\n2.Pop\n3.Peek");
        int choice = sc.nextInt();
        
        switch( choice ) {
            case 1:
                System.out.println("Enter the element: ");
                st.push(sc.nextInt());
                System.out.println("Process Completed");
                break;
            case 2:
                st.pop();
                System.out.println("Process Completed");
                break;
            case 3:
                st.peek();
                System.out.println("Process Completed");
                break;
            default: 
                System.out.println("Invalid Operation");
                break;
        }
        System.out.println("Do you wish to continue? (y/n): ");
        op = sc.next().charAt(0);

        }while(op == 'y');
                
    }
}
