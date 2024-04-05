 //Program to print:
//        1
//        12
//        123
//        1234
//        12345
 class print_pattern_using_recursive {
   public static void  fun1(int n){
    if(n==1){
        System.out.print(n);
    }
    else{
        fun1(n-1);
        System.out.print(n);
    }
   } 
   public static void fun2(int n,int k){
    if(n==0)
    return ;
    else{
        fun1(k++);
        System.out.println("");
        fun2(n-1,k);
    }
   } 
   public static void main(String[] args) {
    fun2(5,1);
   }
}
