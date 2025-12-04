package StackAndQueue.Stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
      //  CustomStack stack = new CustomStack(5);
        CustomStack stack = new DynamicStack(5);
        stack.push(13);
        stack.push(12);
        stack.push(133);
        stack.push(143);
        stack.push(1223);
        stack.push(113);
        stack.push(103);
       
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
