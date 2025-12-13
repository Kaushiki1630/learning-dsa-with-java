public class TreePaths{
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

    public List<String> binaryTreePaths(Node root) {
        List<String> result = new ArrayList<>();
        if(root == null) return result;

        callingFunc(root, "", result);
        return result;
    }

    public void callingFunc(Node node, String path, List<String> result){
        if(node == null) return;

        path = path + node.val;

        if(node.left == null && node.right == null){
            result.add(path);
            return;
        }

        callingFunc(node.left, path + "->", result);
        callingFunc(node.right, path + "->", result);
    }

}