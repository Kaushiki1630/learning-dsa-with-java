package LinkedList;

public class Main {
        public static void main(String[] args) {

        // SINGLY LINKED LIST

        // CustomLinkedList list = new CustomLinkedList();
        // list.insertAtFirst(1);
        // list.insertAtFirst(2);
        // list.insertAtFirst(4);
        // list.insertAtFirst(6);
        // list.displayLinkendList();

        // list.insertionAtEnd(15);
        // list.insertionAtEnd(20);
        // list.displayLinkendList();

        // list.insert(23, 1);
        // list.insert(63, 1);
        // list.displayLinkendList();

        // list.deletionFromFirst();
        // list.displayLinkendList();

        // // list.deletionFromEnd();
        // // list.displayLinkendList();
    
        // // System.out.println(list.deleteEnd());
        // // list.displayLinkendList();
        
        // System.out.println(list.deletionPosition(2));
        // list.displayLinkendList();

        // list.deleteFromPosition(2);
        // list.displayLinkendList();

        // System.out.println(list.findNode(1));



        // DOUBLY LINKED LIST

        // DoublyLinkedList node = new DoublyLinkedList();
        // System.out.println("INSERTION AT THE BEGINNING:");
        // node.insertAtBegin(1);
        // node.insertAtBegin(3);
        // node.insertAtBegin(5);
        // node.insertAtBegin(7);
    //     System.out.println("Displaying the LinkedList:");
    //     node.displayDoubly();
    //     // System.out.println("Reversing the LinkedList:");
    //     // node.ReverseDoubly();
    //     System.out.println("INSERTION AT THE END:");
    //     node.insertAtBegin(9);
    //     node.insertAtBegin(11);
    //  //   node.ReverseDoubly();
    //     node.insertionATLast(12);
    //     node.displayDoubly();
    //     node.insertAtEnd(18);
    //     node.displayDoubly();
    //     node.insertAtIndex(23, 4);
        //    node.displayDoubly();

        //    node.insertAfterNode(10, 3 );
        //    node.displayDoubly();



        // CIRCULAR LINKED LIST

        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtTail(10);
        cll.insertAtTail(9);
        cll.insertAtTail(8);
        cll.insertAtTail(7);
        cll.displayCLL();
        cll.insertAtHead(11);
        cll.displayCLL();
        cll.delete(11);
        cll.displayCLL();
        cll.delete(7);
        cll.displayCLL();
        cll.delete(9);
        cll.displayCLL(); 
    }
}

