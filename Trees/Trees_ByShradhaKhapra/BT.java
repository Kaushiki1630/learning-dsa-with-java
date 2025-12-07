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
        System.out.print("Height of the binary tree: ");
        System.out.println(tree.height(root));
        System.out.print("Number of nodes in the binary tree: ");
        System.out.println(tree.countNodes(root));
        System.out.print("Sum of Nodes: ");
        System.out.println(tree.sumOfNodes(root));
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

    // ... HEIGHT OF THE BINARY TREE

    public int height(Node node){

        if(node== null){
            return 0;
        }

        int leftheight = height(node.leftSubTree);
        int rightheight = height(node.rightSubTree);

        int finalHeight = Math.max(leftheight, rightheight) + 1;

        return finalHeight;
    }

    // ... COUNTING NUMBER OF NODES

    public int countNodes(Node node){
        if(node == null){
            return 0;
        }

        int leftCount = countNodes(node.leftSubTree);
        int rightCount = countNodes(node.rightSubTree);

        return (leftCount+rightCount+1);
    }

    // ... SUM OF NODES

    public int sumOfNodes(Node node){
        if(node == null){
            return 0;
        }

        int leftsum = sumOfNodes(node.leftSubTree);
        int rightsum = sumOfNodes(node.rightSubTree);

        return (leftsum + rightsum + (node.data));
    }
}