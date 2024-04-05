public class toh1{
    public static void toewr(int n,char from_rod,char to_rod,char aux_rod){
        if (n==0) 
            return;
            toewr(n-1, from_rod, aux_rod, to_rod);
            System.out.println("move disk"+n+"to"+from_rod+"to"+to_rod);
            toewr(n-1, aux_rod, to_rod, from_rod);
    }
    public static void main(String[] args) {
        int N=3;
        toewr(N,'A','B','C');
    }
}