package StackAndQueue.Stack;

import java.util.Stack;

public class StackBasics {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(15);
        stack.push(1);
        stack.push(32);

       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       
       System.out.println(stack.pop());
    }
}
