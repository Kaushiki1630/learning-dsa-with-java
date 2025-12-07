public class KLevel{

    public static class Node{
        int data;
        Node leftSubTree;
        Node rightSubTree;

        public Node(int value){
            data = value;
            leftSubTree=rightSubTree=null;
        }
    }

    public void kthLevel(Node node, int k){
        if(node == null){
            return;
        }
        if(k==1){
            return;
        }

        kthLevel(node.left, k-1);
        kthLevel(node.right, k-1);
    }
    
}