import java.util.*;

//                          THIS IS TRICKYYYYYYY !!!!!!!!!!


public class Postorder {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
        }
    }

    public static List<Integer> postorderTraversal(Node root) {
        List<Integer> result = new ArrayList<>();

        Node dummy = new Node(-1);
        dummy.left = root;

        Node curr = dummy;

        while (curr != null) {

            // Case 1: left child nahi
            if (curr.left == null) {
                curr = curr.right;
            }
            // Case 2: left child hai
            else {
                Node pred = curr.left;

                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                // thread create
                if (pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                }
                // thread exists → process right boundary
                else {
                    collectReverse(curr.left, pred, result);
                    pred.right = null;   // thread remove
                    curr = curr.right;
                }
            }
        }
        return result;
    }

    // Reverse right pointers and collect nodes
    private static void collectReverse(Node from, Node to, List<Integer> result) {
        reverse(from, to);

        Node curr = to;
        while (true) {
            result.add(curr.data);
            if (curr == from) break;
            curr = curr.right;
        }

        reverse(to, from);
    }

    // Reverse right pointers
    private static void reverse(Node from, Node to) {
        Node prev = null, curr = from, next;

        while (prev != to) {
            next = curr.right;
            curr.right = prev;
            prev = curr;
            curr = next;
        }
    }
}
