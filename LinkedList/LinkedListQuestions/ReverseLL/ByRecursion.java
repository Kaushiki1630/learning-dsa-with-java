package LinkedList.LinkedListQuestions.ReverseLL;

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


public class ByRecursion {
    Node head;
    Node tail;

    public void reverse(){
        reverse(head);
    }

    public void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next=null;
    }
}
