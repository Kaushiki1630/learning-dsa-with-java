package LinkedList.LinkedListQuestions;

public class MiddleNode {
    
}

class ListNode{
    int value;
    ListNode next;

    public ListNode(int value){
        this.value=value;
    }

    public ListNode(int value, ListNode next){
        this.value=value;
        this.next = next;
    }
}


class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow= slow.next;
        }

        return slow;
    }
}
