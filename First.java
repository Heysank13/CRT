import java.util.Stack;

public class First {

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after pushing elements: " + stack);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Stack after popping an element: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());
    }

}
