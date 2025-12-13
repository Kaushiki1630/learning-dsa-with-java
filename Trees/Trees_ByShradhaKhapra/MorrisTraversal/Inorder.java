import java.util.*;

public class Inorder{
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int value){
            data = value;
            left = right = null;
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

        root.left = buildTree(preorderSeq);
        root.right = buildTree(preorderSeq);

        return root;
    }

    // MORRIS INORDER TRAVERSAL

    public List<Integer> inorderTraversal(Node root) {
        List<Integer> result = new ArrayList<>();
        Node curr = root;

        while(curr != null){
            if(curr.left == null){
                result.add(curr.data);
                curr = curr.right;
            } else {
                Node pred = curr.left;

                while(pred.right != null && pred.right != curr){
                    pred = pred.right;
                }

                if(pred.right == null){
                    pred.right = curr;     // create thread
                    curr = curr.left;
                } else {
                    pred.right = null;     // remove thread
                    result.add(curr.data);
                    curr = curr.right;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] preorderSeq = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};

        Inorder tree = new Inorder();
        Node root = tree.buildTree(preorderSeq);
        System.out.println(tree.inorderTraversal(root));
    }
}