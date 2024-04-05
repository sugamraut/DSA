import java.util.Scanner;

 class MultiplicationTable {
    public static void multiplication(int a,int k){
        if(k<=10){
            System.out.println(a + " * " + k + " = " + (a * k));
            multiplication(a,k+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int a = sc.nextInt();
        multiplication(a,1);
    }


}
