 import java.util.Scanner;
public class power {
    public static int prod(int x,int y){
        if(y==1)
        return x;
        else{
            return x*prod(x,y-1);
        }

    }
    public static void main(String[] args) {
        System.out.println("enter the value of x,y");
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y=sc.nextInt();
        System.out.println("the power of value is:"+prod(x,y));
    }
}