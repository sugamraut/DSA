import java.util.Arrays;
import java.util.Scanner;

public class bubble_short {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a arry size");
        int size=sc.nextInt();
        System.out.println("entera array element ");
        int []A=new int[size];
        for(int i=0;i<size;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Array before sorting"+Arrays.toString(A));
        bubble_short(A);
        System.out.println("Array after sorting "+Arrays.toString(A));
    }

    public static void bubble_short(int[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

    }
}