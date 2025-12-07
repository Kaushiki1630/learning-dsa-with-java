public class NodeCount{
    public static class Node{
        int data;
        Node leftSubTree;
        Node rightSubTree;

        public Node(int value){
            data = value;
            leftSubTree=rightSubTree=null;
        }
    }

    public int countNodes(Node node){
        if(node == null){
            return 0;
        }

        int leftCount = countNodes(node.leftSubTree);
        int rightCount = countNodes(node.rightSubTree);

        return (leftCount+rightCount+1);
    }
}