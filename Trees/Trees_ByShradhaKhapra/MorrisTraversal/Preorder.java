import java.util.*;

public class Preorder {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    public static List<Integer> preorderTraversal(Node root) {
        List<Integer> result = new ArrayList<>();
        Node curr = root;

        while (curr != null) {

            // Case 1: left child nahi hai
            if (curr.left == null) {
                result.add(curr.data);      // visit
                curr = curr.right;
            }
            // Case 2: left child hai
            else {
                Node pred = curr.left;

                // inorder predecessor dhundo
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                // thread nahi bana
                if (pred.right == null) {
                    result.add(curr.data);  // PREORDER visit yahin hota hai
                    pred.right = curr;      // thread create
                    curr = curr.left;
                }
                // thread already exists
                else {
                    pred.right = null;      // thread remove
                    curr = curr.right;
                }
            }
        }
        return result;
    }
}
