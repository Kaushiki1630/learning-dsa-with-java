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

public class ByBubbleSort {
    Node head;
    Node tail;
    int size;

    public ByBubbleSort(){
        this.size=0;
    }

    public void sortByBubble(){
        sortByBubble(size-1, 0);
    }

    private void sortByBubble(int row, int col) {
        if(row == 0){
            return;
        }

        if(col < row){
            Node first = getNode(col);
            Node second = getNode(col +1);

            if(first.value > second.value){
                // swap
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                else if(second == tail){
                    Node prev = getNode(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }
                else{
                    Node prev = getNode(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            } 
            sortByBubble(row, col +1);
        }    else{
            sortByBubble(row -1, 0);
        }
    }

    public Node getNode(int index){
        Node temp= head;
        for(int i=0; i<index; i++){
            temp=temp.next;
        }

        return temp;
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

    public static void main(String[] args) {
        ByBubbleSort list = new ByBubbleSort();
        list.insertAtFirst(5);
        list.insertAtFirst(1);
        list.insertAtFirst(8);
        list.insertAtFirst(2);
        list.insertAtFirst(3);
    
        list.displayLinkendList();
        list.sortByBubble();
        list.displayLinkendList();

    }
    
}
