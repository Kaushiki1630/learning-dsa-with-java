package LinkedList.LinkedListQuestions;

public class RecursiveInsertion {

    Node head;
    Node tail;
    int size;

    public RecursiveInsertion(){
        this.size=0;
    }

    public void RecusriveInsert(int value, int index){
        head = insertRec(value, index, head);
    }

    private Node insertRec(int value, int index, Node node){
        if(index ==0){
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

       node.next= insertRec(value, index-1, node.next);
       return node;
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
}
