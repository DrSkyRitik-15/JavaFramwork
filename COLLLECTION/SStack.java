import java.util.*;

public class SStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        stack.push("F");


        System.out.println(stack);
        System.out.println("===============================");
        
        
        stack.pop();
        
        System.out.println(stack);
        // System.out.println("===============================");







    }
}
