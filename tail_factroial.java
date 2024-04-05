
import java.util.Scanner;

 class TailFact {
    public static int factorial(int n,int result){
        if(n==0)
            return result;
        else{
            return (factorial(n-1,n*result));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n= sc.nextInt();
        System.out.println("Factorial : "+factorial(n,1));
    }
}
