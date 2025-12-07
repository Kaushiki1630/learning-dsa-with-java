public class NodesSum{
    public static class Node{
        int data;
        Node leftSubTree;
        Node rightSubTree;

        public Node(int value){
            data = value;
            leftSubTree=rightSubTree=null;
        }
    }

    public int sumOfNodes(Node node){
        if(node == null){
            return 0;
        }

        int leftsum = sumOfNodes(node.leftSubTree);
        int rightsum = sumOfNodes(node.rightSubTree);

        return (leftsum + rightsum + (node.data));
    }
}