import java.util.*;

class stack { 
    public static void main(String[] args) {
        /*
        Stack<String> stack = new Stack<>();  //LIFO- PUSH POP
        stack.push("ankit");
        stack.push("amit");
        stack.push("sony");
        stack.push("lg");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
    }
    */

    ArrayDeque<String> stack = new ArrayDeque<>(); //FIFO- PUSH POP

    stack.push("ankit");
        stack.push("amit");
        stack.push("sony");
        stack.push("lg");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

    





    }
}
