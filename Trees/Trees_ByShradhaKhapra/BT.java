import java.util.LinkedList;
import java.util.Queue;

public class BT{

    public static void main(String[] args) {
        int[] preorderSeq = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};

        BT tree = new BT();
        Node root = tree.buildTree(preorderSeq);
        System.out.println("Preorder traversal");
        tree.preorderTraversal(root);
        System.out.println();
        System.out.println("Inorder traversal");
        tree.inorderTraversal(root);
        System.out.println();
        System.out.println("Postorder traversal");
        tree.postorderTraversal(root);
        System.out.println();
        System.out.println("Level order traversal");
        tree.levelorderTraversal(root);
        System.out.println();
    }

    public static class Node{
        int data;
        Node leftSubTree;
        Node rightSubTree;

        public Node(int value){
            data = value;
            leftSubTree=rightSubTree=null;
        }
    }

    // Building a binary tree

    int index = -1;
    public Node buildTree(int[] preorderSeq){
        index++;

        if (index >= preorderSeq.length) {
            return null;
        }

        if(preorderSeq[index] == -1){
            return null;
        }

        Node root = new Node(preorderSeq[index]);

        root.leftSubTree = buildTree(preorderSeq);
        root.rightSubTree = buildTree(preorderSeq);

        return root;
    }


    // ... PREORDER TRAVERSAL

    public void preorderTraversal(Node node){
        
        if(node == null){
            return;
        }

        System.out.print(node.data + " ");

        preorderTraversal(node.leftSubTree);
        preorderTraversal(node.rightSubTree);
    }


    // .... INORDER TRAVERSAL

    public void inorderTraversal(Node node){
        
        if(node == null){
            return;
        }

        inorderTraversal(node.leftSubTree);
        System.out.print(node.data + " ");
        inorderTraversal(node.rightSubTree);
    }


    // .... POSTORDER TRAVERSAL

    public void postorderTraversal(Node node){
        
        if(node == null){
            return;
        }

        postorderTraversal(node.leftSubTree);
        postorderTraversal(node.rightSubTree);
        System.out.print(node.data + " ");
    }


    // LEVEL ORDER TRAVERSAL

    public void levelorderTraversal(Node node){
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);
        
        while(!q.isEmpty()){
            Node current  = q.poll();
            if(current == null){
                if(!q.isEmpty()){
                    System.out.println();
                    q.add(null);
                }
                else{
                    break;
                }

                continue;
            }
            System.out.print(current.data + " ");

            if(current.leftSubTree != null){
                q.add(current.leftSubTree);
            }

            if(current.rightSubTree != null){
                q.add(current.rightSubTree);
            }
        }
    }



}