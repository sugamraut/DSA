import java.util.Scanner;
 class GcdCalculation {
    public static int gcd(int a,int b){
        if (a==0)
            return b;
        else
            return gcd(b%a,a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 nonnegative integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD :"+gcd(a,b));
    }
}
