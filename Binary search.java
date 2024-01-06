import java.util.Scanner;

class Binary{
    public static Integer binarysearch(int [] arr,int key){
    int lo=0,mid,hi=arr.length-1;
    while (lo<=hi) {
        mid=(hi+lo)/2;
        if(key<arr[mid]){
            hi=mid-1;
        }
        else if(key>arr[mid]){
            lo=mid+1;
        }
        else return arr[mid];
        
    } return null;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,8,13,16};
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter search key");
        int key =sc.nextInt();
        if(binarysearch(arr, key)!=null){
            System.out.println("element found");
        }
        else {
            System.out.println("element not found");
        } 
        sc.close();
    }
    
}
