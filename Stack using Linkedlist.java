import java.util.LinkedList;
class Stack{
    LinkedList<Integer> l=new LinkedList<>();
    public void pop(){
    l.removeFirst();
}
    public void push(int data){
        l.addFirst(data);
    }
    public Integer peek(){
        return l.getFirst();
    }
    public void clear(){
        l.clear();
    }
    public void printAll(){
        
    }
}
class Stack_Demo_LL{
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(11);
        s.push(10);
        s.push(9);
        s.pop();
         s.printAll();

        System.out.println("the topmost element currently is : "+s.peek());
        s.clear();
       // System.out.println( s.push(1));
        //int d=s.push(4);
    }
}
