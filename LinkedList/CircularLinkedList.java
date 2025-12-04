package LinkedList;

public class CircularLinkedList {
    Node head;
    Node tail;
    int size;

    public CircularLinkedList(){
        this.head=null;
        this.tail=null;
    }

    public void insertAtTail(int value){
        Node newNode = new Node(value);

        if(head==null){
            head=tail=newNode;
            tail.next =head;
            size++;
            return;
        }

        tail.next = newNode;
        newNode.next=head;
        tail=newNode;

        size++;
    }

    // inserting at the beginning in the circular linked list
    public void insertAtHead(int value){
        Node node = new Node(value);

        if(head == null){
            head=tail=node;
            tail.next=head;
            size++;
            return;
        }

        node.next=head;
        tail.next = node;
        head = node;

        size++;
    }

    //display the circular linked list
    public void displayCLL(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }
            while(temp !=head);
            System.out.println("Head");
        }
    }

    // deletion in the circular linked list
    public void delete(int value){
        Node target = findNode(value);

        if(target == null){
            System.out.println("Value not present in the list.");
            return;
        }

        if(target == head){
            if(head ==tail){
                head = tail = null;
                size--;
                return;
            }
            else{
                head = head.next;
                tail.next=head;
                size--;
                return;
            }
        }

        if(target == tail){
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }

            temp.next = head;
            tail=temp;

            size--;

            return;
        }

        

        Node temp = head;
        while(temp.next != target){
            temp = temp.next;
        }

        temp.next = target.next;
        size--;

        return;

    }

    public Node findNode(int value){
        Node temp = head;
        if (head == null) return null;

    do {
        if(temp.value == value){
            return temp;
        }
        temp = temp.next;
    } while(temp != head);

        return null;
    }

    public class Node{
        
        int value;
        Node next;

       public Node(int value){
        this.value= value;
        }

        public Node(int value, Node next){
            this.value= value;
            this.next = next;
            }
    }
}
