package StackAndQueue.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
     //   CustomQueue queue = new CustomQueue();
        CircularQueue queue = new CircularQueue(5);
        queue.insertCircular(15);
        queue.insertCircular(25);
        queue.insertCircular(35);
        queue.insertCircular(45);
        queue.insertCircular(55);

        queue.displayCircular();

        System.out.println(queue.removeCircular());

        queue.displayCircular();

        queue.insertCircular(34);
        queue.displayCircular();
        queue.removeCircular();
        queue.displayCircular();
    }
}
