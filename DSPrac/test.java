package DSPrac;

public class test {
    public static void main(String[] args) {
        stack s1 = new stack(10);
        s1.peek();
        s1.push(30);
        s1.push(10);
        s1.push(34);
        s1.push(20);
        System.out.println("Top element is: " + s1.peek());
        s1.pop();
        s1.pop();
        s1.pop();
        s1.pop();
        System.out.println("Is stack empty: " + s1.isEmpty());
    }
}
