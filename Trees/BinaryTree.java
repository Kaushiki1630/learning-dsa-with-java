package Trees;

import java.util.Scanner;

public class BinaryTree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();
        tree.inserting(scanner);
        tree.displayTree();
    }

    public BinaryTree(){

    }


    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value=value;
        }
    }

    private Node root;

    //inserting elements

    public void inserting(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);

        inserting(scanner, root);
    }

    private void inserting(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            inserting(scanner, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            inserting(scanner, node.right);
        }
    }

    // displaying the tree formed

    public void displayTree(){
        displayTree(this.root, "");
    }

    public void displayTree(Node node, String indent){
        if(node == null){
            return;
        }

        System.out.println(indent + node.value);
        displayTree(node.left, indent + "\t");
        displayTree(node.right, indent + "\t");

    }
}

