import java.util.Arrays;
import java.util.Scanner;

 class bubble_short {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        
        System.out.println("Enter array elements:");
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = sc.nextInt();
        }
        
        System.out.println("Array before sorting: " + Arrays.toString(A));
        insertion_sort(A, size); // Pass size instead of undefined variable n
        System.out.println("Array after sorting: " + Arrays.toString(A));
    }
    
    public static void insertion_sort(int A[], int n) {
        for (int i = 0; i < n; i++) {
            int temp = A[i];
            int j = i;
            while (j > 0 && temp < A[j - 1]) {
                A[j] = A[j - 1];
                j--;
            }
            A[j] = temp;
        }
    }
}
