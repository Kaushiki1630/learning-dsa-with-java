package LinkedList.LinkedListQuestions;

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


public class ReorderList {
    ListNode head;

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow= slow.next;
        }

        return slow;
    }

    public ListNode reverseList(ListNode head){
        if(head == null){
            return head;
        }
        
        ListNode prev = null;
        ListNode present = head;

        while(present != null){
            ListNode next = present.next;
            present.next = prev;
            prev = present;
            present=next;
        }

        return prev;
    }
    
    public void reorderList(ListNode head) {
            if(head == null || head.next == null){
                return;
            }

            ListNode mid = middleNode(head);
            ListNode hs = reverseList(mid);
            ListNode hf = head;

            while(hs!= null && hf!= null){
                ListNode temp1 = hf.next;
                ListNode temp2 = hs.next;

                hf.next = hs;
                hs.next = temp1;

                hf = temp1;
                hs = temp2;
            }

            if(hf != null){ 
                hf.next = null;
            }
        }
}
