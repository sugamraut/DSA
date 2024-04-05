



class looprecur {
    public static void func1(int n){
        if(n==1)
            System.out.print(n);
        else{
            func1(n-1);
            System.out.print(n);
        }
    }
    public static void func2(int n,int k){
        if(n==0)
            return;
        else {
            func1(k++);
            System.out.println("");
            func2(n-1,k);
        }
    }

    public static void main(String[] args) {
        func2(5,1);
    }

}
