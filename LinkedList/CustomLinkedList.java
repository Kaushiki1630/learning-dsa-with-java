package LinkedList;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;
    
    public CustomLinkedList(){
            this.size=0;
        }

    //insertion at the beginning

    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head= node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    // displaying the items of the linked list

    public void displayLinkendList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println();
        System.out.println("END of the LL.");
    }

    // insertion at the end
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

    //insertion at particular index
    public void insert(int value, int index){
        if(index == 0){
            insertAtFirst(value);
            return;
        }

        if(index == size){
            insertionAtEnd(value);
            return;
        }

        Node temp = head; 
        for(int i = 1; i< index; i++){
            temp = temp.next;
        }

        Node newNode = new Node(value, temp.next);
        temp.next = newNode;

        size++;
    }

    //deletion of an item from the linked list
    // from the beginning 
    public void deletionFromFirst(){
        if(head == null){
            System.out.println("LinkedList is empty.");
            return;
        }

        if(head == tail){
            head = null;
            tail= null;
        }

        else{
            head = head.next;
        }

        size--;
    }

    // or returning the deleted item
    public int deleteFirst(){
        if(head == null){
            throw new RuntimeException("LL is already empty.");
            
        }

        int val = head.value;
        
        head = head.next;

        if(head == null){
            tail= null;
        }

        size--;

        return val;
    }


  //  deletion from the end
    public void deletionFromEnd(){
        if(head== null){
            System.out.println("LinkedList is emptty.");
        }

        if(head==tail){
            head= null;
            tail= null;
        }
        else{
        Node temp = head;
        // while(temp.next != tail){
        //     temp = temp.next;
        // }

        for(int i=1; i<size-1; i++){
            temp = temp.next;
        }
        
        temp.next= null;
        tail= temp;
        }

        size--;
    }

    //or returning the deleted item from the end
    public int deleteEnd(){
        if(size<= 1){
            deletionFromFirst();
        }

        Node secondNode = get(size-2);

        int val = tail.value;
        tail=secondNode;
        tail.next = null;

        return val;
    }

    public Node get(int index){
        Node newNode = head;
        for(int i=0; i< index; i++){
            newNode= newNode.next;
        }

        return newNode;
    }

    // deletion from a particular index(position)
    // returning the deleted node
    public int deletionPosition(int index){
        if(index==0){
            return deleteFirst();
        }

        if(index == size -1){
            return deleteEnd();
        }

        Node prev = get(index-1);
        Node target = get(index);

        int val = prev.next.value;

        prev.next = target.next;
        size --;

        return val;
    }

    // deleting the node from any position
    public void deleteFromPosition(int index){
        if(head == null){
            System.out.println("LL is empty.");
            return;
        }

        if(index <0 || index >=   size){
            System.out.println("Index is not present in the list");
            return;
        }

        if(index==0){
            deletionFromFirst();
            return;
        }

        if(index == size-1){
            deletionFromEnd();
            return;
        }

        Node beforeTarget = get(index-1);
        Node target = get(index);

        beforeTarget.next = target.next;
        size--;
    }

    // returing the node when the value is given
    public Node findNode(int value){
        Node newNode = head;
        while(newNode != null){
            if(newNode.value == value){
                return newNode;
            }
            newNode = newNode.next;
        }

        return null;
    }


    private class Node{

        private int value;
        private Node next;

       public Node(int value){
        this.value= value;
        }

        public Node(int value, Node next){
            this.value= value;
            this.next = next;
            }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + '}';
    }
    }
}
