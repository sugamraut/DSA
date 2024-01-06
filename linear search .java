import java.util.Scanner;

class linear{
    public static boolean linearsearch(int arr[],int key){
      boolean found=false;
      for(int i=0;i<arr.length;i++){
        if(key==arr[i]){
            found=true;
            break;
        }
      }
      return found;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,8,24,25};
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a search key");
        int key=sc.nextInt();
        if(linearsearch(arr, key)){
            System.out.println("element found  ");

        }
        else{
            System.out.println("element not found");
        }
        sc.close();
    }
}
// time complexity=0(n)