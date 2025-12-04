package LinkedList.LinkedListQuestions;

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

public class HeadOfCycle {
    Node head;

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
    
    public Node cycleHead(Node head){
        int Length =0;

            Node fast = head;
            Node slow = head;
    
            while(fast !=null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow){
                    Length = LengthOfCycle(slow);
                    break;
                }
            }

            if(Length==0){
                return null;
            }

            // find the head;
            Node first = head;
            Node second = head;

            for(int i=0; i< Length; i++){
                second = second.next;
            }

            while(first != second){
                first= first.next;
                second=second.next;
            }

            return first;
    }
}
