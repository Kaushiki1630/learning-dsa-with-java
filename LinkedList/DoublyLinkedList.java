package LinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public DoublyLinkedList(){
        this.size=0;
    }

    //INSERTION
    // insertion at the beginning
    public void insertAtBegin(int value){
        Node newNode = new Node(value);
        if(head==null){
            head=tail= newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    //DISPLAY
    public void displayDoubly(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println();
        System.out.println("END");
    }

    //REVERSE A LINKEDLIST
    public void ReverseDoubly(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }

        System.out.println();
        System.out.println("END");
    }

    //INSERTION
    // inserting an item at the end of the doubly linked list
    // method 1
    public void insertAtEnd(int value){
        Node newNode = new Node(value);
        if(head== null){
            head = tail = newNode;
        }
        else{     
        tail.next = newNode;
        newNode.prev= tail;
        tail= newNode;
        }

        size++;
    }


    // method 2
    public void insertionATLast(int value){
        Node temp = head;
        while(temp != tail){
            temp = temp.next;
        }

        Node newNode = new Node(value);

        if(head==null){
            head=tail=newNode;
        }
        else{
        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;
        }

        size++;
    }

    //insertion at the given index
    public void insertAtIndex(int value, int index){
        Node node = new Node(value);

        if(head == null){
            head = tail = node;
            size++;
            return;
        }

        if(index<0 || index>size){
            System.out.println("Index out of bound.");
            return;
        }

        if(index==0){
            insertAtBegin(value);
            return;
        }

        if(index == size){
            insertAtEnd(value);
            return;
        }

        
            Node previous = getNode(index-1);
            Node target = getNode(index);
        //    Node target =previous.next;
            
            previous.next=node;
            node.prev= previous;
            node.next = target;
            target.prev = node;

        size++;

    }

    public Node getNode(int index){
        Node temp= head;
        for(int i=0; i<index; i++){
            temp=temp.next;
        }

        return temp;
    }

    // INSERTING A NODE AFTER A GIVEN NODE
    public void insertAfterNode(int value, int AddAfterThis){
        Node temp = findNode(AddAfterThis);
        if(temp == null){
            System.out.println("Node with value " + AddAfterThis + " not found.");
            return;        
        }
        
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if(node.next != null){
            node.next.prev=node;
        }
        else{
            tail = node;
        }

        size++;
        
    }

    public Node findNode(int value){
        Node temp = head;
        while(temp != null){
            if(temp.value == value){
                return temp;
            }
            temp = temp.next;
        }

        return null;
    }

    public class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next, Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}
