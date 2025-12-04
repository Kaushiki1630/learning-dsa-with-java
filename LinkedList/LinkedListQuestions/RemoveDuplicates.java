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

public class RemoveDuplicates {
    Node head;
    Node tail;
    int size;

    public RemoveDuplicates(){
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

    public void DuplicatesRemove(){
        Node temp = head;

        while(temp.next != null){
             if(temp.value == temp.next.value){
                temp.next = temp.next.next;
                size--;
             }
             else{
                temp = temp.next;
             }
        }

        tail = temp;
      //  tail.next=null;
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

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        rd.insertAtFirst(1);
        rd.insertAtFirst(1);
        rd.insertAtFirst(1);
        rd.insertAtFirst(3);
        rd.insertAtFirst(3);
        rd.insertAtFirst(4);
        rd.insertAtFirst(4);
        rd.displayLinkendList();
        rd.DuplicatesRemove();
        rd.displayLinkendList();
    }
}
