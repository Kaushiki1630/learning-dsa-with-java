package StackAndQueue.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12); 
        queue.add(3); 
        queue.add(42); 
        queue.add(6); 
        queue.add(15); 

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());

        queue.offer(133);

        //will return true as item has been inserted successfully
        System.out.println(queue.offer(88));

    }
}
