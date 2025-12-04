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

public class MergeSortedLL {

    public Node head;
    Node tail;
    int size;

    public MergeSortedLL(){
        this.size=0;
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

    public MergeSortedLL MergeLL(MergeSortedLL list1, MergeSortedLL list2){
        Node head1 = list1.head;
        Node head2 = list2.head;

        MergeSortedLL answer = new MergeSortedLL();

        while( head1 != null && head2 != null){
            if(head1.value < head2.value){
                answer.insertionAtEnd(head1.value);
                head1 = head1.next;
            }
            else{
                answer.insertionAtEnd(head2.value);
                head2 = head2.next;
            }
        }

        while(head1 != null){
            answer.insertionAtEnd(head1.value);
            head1 = head1.next;
        }

        while(head2 != null){
            answer.insertionAtEnd(head2.value);
            head2 = head2.next;
        }

        return answer;
    }

    public static void main(String[] args) {
        MergeSortedLL ms1 = new MergeSortedLL();
        ms1.insertionAtEnd(1);
        ms1.insertionAtEnd(3);
        ms1.insertionAtEnd(4);
        ms1.displayLinkendList();

        MergeSortedLL ms2 = new MergeSortedLL();
        ms2.insertionAtEnd(1);
        ms2.insertionAtEnd(2);
        ms2.insertionAtEnd(4);
        ms2.displayLinkendList();

        MergeSortedLL ans = new MergeSortedLL();
        ans = ans.MergeLL(ms1, ms2);
        ans.displayLinkendList();

        
    }
    

}
