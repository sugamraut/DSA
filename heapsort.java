public class heapsort {
    public static void swap(int[] data,int index1,int index2)
    {
    int temp=data[index1];
    data[index1]=data[index2];
    data[index2]=temp;
    }
    public static void moveDown(int[] data, int first, int last) {
    int largest = 2 * first + 1;
    while (largest <= last) {
    if (largest < last
    && data[largest] < data[largest + 1]) {
    largest++;
    }
    if (data[first] < data[largest]) {
    swap(data, first, largest);
    first = largest;
    largest = 2 * first + 1;
    } else {
    largest = last + 1;
    }
    }
    }
    public static void heapify(int[] data,int n)
    {
    for(int i=n/2-1;i>=0;i--)
    {
    moveDown(data,i,n-1);
    }
    }
    public static void hsort(int[] data,int n)
    {
    heapify(data,n);
    for(int i=n-1;i>=0;i--)
    {
    swap(data,0,i);
    heapify(data,i);
    }
    }
    public static void printArray(int[] arr)
    {
    for(int v:arr)
    {
    System.out.print(v+"\t");
    }
    }
    public static void main(String[] args) {
    int[] arr={2,8,6,12,10,15,3,1,11};
    hsort(arr,arr.length);
    printArray(arr);
    }
    }
