public class BuildBST{
    class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    Node buildTree(int[] arr){
        Node root = null;

        for(int i=0; i<arr.length; i++){
            root = insert(root, arr[i]);
        }

        return root;
    }

    Node insert(Node root, int target){
        if(root==null){
            Node temp = new Node(target);
            return temp;
        }

        if(target<root.data){
            root.left = insert(root.left, target);
        }
        else{
            root.right = insert(root.right, target);
        }

        return root;
    }

    // Inorder Traversal

    void inorderTraversal(Node root){
        if(root == null){
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    // Searching in BST
    Boolean search(Node root, int target){
        if(root == null) return false;

        if(root.data == target){
            return true;
        }
        if(root.data>target){
            return search(root.left, target);
        }
        else{
            return search(root.right, target);
        }

    }

    public static void main(String[] args) {
        int[] arr = {6,3,17,5,11,18,2,1,20,14};
        BuildBST tree = new BuildBST();
        Node root = tree.buildTree(arr);
        tree.inorderTraversal(root);
        System.out.println(tree.search(root, 18));
    }

}