package LinkedList.LinkedListQuestions;

public class CycleLength {
    Node head;

    public boolean hasCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast !=null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }

        return false;
    }

public int LengthOfCycle(Node head) {
    Node fast = head;
    Node slow = head;

    while(fast !=null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
        if(fast == slow){
            int count=0;
            Node temp = slow;
            do{
                temp = temp.next;
                count++;
            }
            while(temp != slow);

            return count;
        } 
    }
    return 0;
}
}

class Node{
    int value;
    Node next;

    public Node(int value){
        this.value=value;
    }

    public Node(int value, Node next){
        this.value=value;
        this.next = next;
    }
}


