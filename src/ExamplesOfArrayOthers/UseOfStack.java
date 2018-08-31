package ExamplesOfArrayOthers;

import java.util.Stack;

public class UseOfStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.add("TN");
        stack.add("GA");
        stack.add("PA");
        stack.add("CA");
        stack.add("NY");

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }



    }
}
