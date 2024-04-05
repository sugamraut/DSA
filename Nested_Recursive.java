import java.util.Scanner;
class NestedRecursion {
    public static int h(int n){
        if(n==0)
            return 0;
        else if (n>4) {
            return n;
        }
        else{
            return h(2+h(2*n));
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter value to check:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(h(n));;
    }

}