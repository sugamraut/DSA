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
        insertion_sort(A,n);
        System.out.println("Array after sorting "+Arrays.toString(A));
    }
}
 public void insertion_sort ( int A[ ] , int n)
{
for( int i = 0 ;i < n ; i++ ) {
/*storing current element whose left side is checked for its
correct position .*/
int temp = A[ i ];
int j = i;
/* check whether the adjacent element in left side is greater or
less than the current element. */
while( j > 0 && temp < A[ j -1]) {
// moving the left side element to one position forward.
A[ j ] = A[ j-1];
j= j - 1;
}
// moving current element to its correct position.
A[ j ] = temp;
}
}