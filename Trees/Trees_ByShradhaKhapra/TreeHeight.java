public class TreeHeight{
    public static class Node{
        int data;
        Node leftSubTree;
        Node rightSubTree;

        public Node(int value){
            data = value;
            leftSubTree=rightSubTree=null;
        }
    }

    public int height(Node node){

        if(node== null){
            return 0;
        }

        int leftheight = height(node.leftSubTree);
        int rightheight = height(node.rightSubTree);

        int finalHeight = Math.max(leftheight, rightheight) + 1;

        return finalHeight;
    }
}