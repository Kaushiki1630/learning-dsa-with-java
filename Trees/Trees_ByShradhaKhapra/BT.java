public class BT{

    public static void main(String[] args) {
        int[] preorderSeq = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};

        BT tree = new BT();
        Node root = tree.buildTree(preorderSeq);
        tree.preorderTraversal(root);

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

    public void preorderTraversal(Node node){
        
        if(node == null){
            return;
        }

        System.out.println(node.data);
        preorderTraversal(node.leftSubTree);
        preorderTraversal(node.rightSubTree);
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

        root.leftSubTree = buildTree(preorderSeq);
        root.rightSubTree = buildTree(preorderSeq);

        return root;
    }





}