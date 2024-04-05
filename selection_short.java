import java.util.Arrays;
import java.util.Scanner;

public class selection_short {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a arry size");
        int size=sc.nextInt();
        System.out.println("entera array element ");
        int []A=new int[size];
        for(int i=0;i<size;i++){
            A[i]=sc.nextInt();
        }
        System.out.println("Array before sorting"+Arrays.toString(A));
        selection_short(A);
        System.out.println("Array after sorting "+Arrays.toString(A));
    }
    public static void selection_short(int []array){
        int size=array.length;
        for(int i=0;i<size-1;i++){
            int min_idx=i;
            for(int j=i+1;j<size;j++){
                if (array[min_idx]>array[j]) {
                    min_idx=j;  
                }           
            }
            int temp=array[i];
            array[i]=array[min_idx];
            array[min_idx]=temp;
           
        }

    }
}
