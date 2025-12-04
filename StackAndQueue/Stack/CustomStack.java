package StackAndQueue.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
       // this(DEFAULT_SIZE);
       this.data = new int[DEFAULT_SIZE];
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item) throws StackException{
        if(isFull()){
            throw new StackException("Cannot insert! Stack is full");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length-1;
    }

    public boolean isEmpty() {
        return ptr==-1;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot delete! Stack is empty.");
        }

        int removed = data[ptr];
        ptr--;

        return removed;
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot Find Peek! Stack is empty.");
        }
        return data[ptr];
    }


}
