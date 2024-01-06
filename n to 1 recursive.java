import java.util.Scanner;
 class  recursive_n_to_1 {
    public static void number(int n){
        if(n==0){
            System.out.println(0);
        }
        else{
            System.out.println(n);

            number(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("the output is");
        number(n);
    }
    
}
