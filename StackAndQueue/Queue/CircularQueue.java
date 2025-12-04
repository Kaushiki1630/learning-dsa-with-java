package StackAndQueue.Queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
     }
 
    public CircularQueue(int size){
         this.data = new int[size];
     }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean insertCircular(int item){
        if(isFull()){
            return false;
        }

        data[end] = item;
        end++;
        end = end % data.length;
        size++;
        return true;
    }

    public int removeCircular() throws Exception{
        if(isEmpty()){
            throw new Exception("Circular Quewue is empty");
        }

        int removed = data[front];
        front = (front + 1) % data.length;
        size--;

        return removed;

    }

    public int frontCircular() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Expty");
        }

        return data[front];
    }

    public void displayCircular(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i] + " -> ");
            i++;
            i%= data.length;
        } while(i != end);
        System.out.println("End!");
    }

    
}
