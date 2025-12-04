package StackAndQueue.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(143);
        dq.add(1);
        dq.add(14);

        dq.addFirst(1223);
        dq.remove();
    }
}
