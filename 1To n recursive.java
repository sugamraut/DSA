import java.util.Scanner;
class recursive_1t0_n{
    public static void number(int n){
        if(n==0){
            return ;
        }
        else{
            number(n-1);
            System.out.println("the recursive value is"+n);
        }
    }
     public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("the output is");
        number(n);
     }
}