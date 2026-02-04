package DSPrac;

public class stack {
    private int[] stack;
    private int maxSize;
    private int top;

    public stack(int size){
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int value){
        if (top == maxSize - 1){
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
        System.out.println(value + " pushed into the stack");
    }

    public int pop(){
        if (top == -1){
            System.out.println("Stack underflow");
            return -1;
        }

        int poppedElement = stack[top--];
        System.out.println(poppedElement + " removed from the stack");
        return poppedElement;
    }

    public int peek(){
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty(){
        return (top  == -1);
    }

    
}
