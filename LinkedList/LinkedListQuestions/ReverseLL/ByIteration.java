package LinkedList.LinkedListQuestions.ReverseLL;

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

public class ByIteration {
    ListNode head;

    public ListNode reverseList(ListNode head){
        if(head == null){
            return head;
        }
        
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present=next;
            if(next != null){
                next = next.next;
            }
        }

        return prev;
    }
}
