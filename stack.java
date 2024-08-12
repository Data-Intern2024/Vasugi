public class stack {
    private int maxSize;
    private int [] Array;
    private int top;
    public stack(int size){
        maxSize = size;
        Array = new int[maxSize];
        top = -1;

    }
    public  void push(int value){
        if(top == maxSize -1){
            System.out.println("Stack overflow");
            return;
        }
        Array[++top]  = value;
        System.out.println(value + "pushed  to stack");
  }
   public int pop(){
    if(top == -1){
        System.out.println("Stack underflow");
        return -1;
    }

   int popElem =Array[top--];
   System.out.println(popElem + "popped from stack");
   return popElem;
}
public int top() {
    if (top == -1) {
        System.out.println("Stack is empty");
        return -1;
    }
    return Array[top];
}
public boolean isEmpty() {
    return (top == -1);
}

public static void main(String[] args){
    stack s = new stack(5);
    s.push(10);
    s.push(20);
    System.out.println("Top element of the stack: " + s.top());
    s.pop();
    s.pop();
    s.pop();
    System.out.println("Is stack empty? " + s.isEmpty());
}

}
