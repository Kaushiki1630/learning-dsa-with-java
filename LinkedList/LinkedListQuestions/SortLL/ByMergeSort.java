package LinkedList.LinkedListQuestions.SortLL;

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

public class ByMergeSort {
    Node head;
    Node tail;
    int size;

    public ByMergeSort(){
        this.size=0;
    }

    public Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node left = sortList(head);
        Node right = sortList(mid);

        return mergeLL(left, right);
    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) prev.next = null;
        return slow;
    }

    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head= node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insertionAtEnd(int value){
        Node node = new Node(value);

        if(tail == null){
            insertAtFirst(value);
            return;
        }

        tail.next = node;
        tail = node;
        
        size++;

    }

    public void displayLinkendList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println();
        System.out.println("END of the LL.");
    }


    public Node mergeLL(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        temp.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }

    public static void main(String[] args) {
        ByMergeSort list = new ByMergeSort();
        list.insertAtFirst(5);
        list.insertAtFirst(1);
        list.insertAtFirst(8);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
    
        list.displayLinkendList();
    
        list.head = list.sortList(list.head);
        list.displayLinkendList();
    }
    

}
