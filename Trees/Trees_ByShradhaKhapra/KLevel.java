public class KLevel{
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