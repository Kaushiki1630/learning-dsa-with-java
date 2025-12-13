public class TreeSum{
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int value){
            data = value;
            left=right=null;
        }
    }

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

    // ... PREORDER TRAVERSAL

    public void preorderTraversal(Node node){
        
        if(node == null){
            return;
        }

        System.out.print(node.data + " ");

        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public int treesum(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = treesum(root.left);
        int rightsum = treesum(root.right);

        root.data = root.data + leftsum + rightsum;

        return root.data;
    }

    public static void main(String[] args) {
        int[] preorderSeq = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};

        TreeSum tree = new TreeSum();
        Node root = tree.buildTree(preorderSeq);
        tree.preorderTraversal(root);
        System.out.println();
        tree.treesum(root);
        tree.preorderTraversal(root);
        System.out.println();

    }
}
