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


    // Delete a given node in the BST
    Node delete(Node root, int target){
        if(root == null){
            return null;
        }

        if(root.data > target){
            root.left = delete(root.left, target);
            return root;
        }
        if(root.data < target){
            root.right = delete(root.right, target);
            return root;
        }
        else{
            // root.data == target ( iska mtlb hai ki hame yahi node delete krni hai)
            // pr idhar 3 cases ban skte hain

            // leaf node ko delete kr rhe hain
            if(root.right == null && root.left == null){
                //delete root;
                return null;
            }

            // ya fir aisi node jiska sirf 1 child hai (either left or right)
            if(root.right == null){
                Node temp = root.left;
                return temp;
            }
            if(root.left == null){
                Node temp = root.right;
                return temp;
            }

            // ya fir aisi node jiske 2 child hain
            else{
            Node child = root.left;
            Node parent = root;

            while(child.right != null){
                parent=child;
                child=child.right;
            }

            if(root == parent){
                child.right = root.right;
                return child;
            }
            else{
                parent.right=child.left;
                child.left=root.left;
                child.right=root.right;
                return child;
            }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,3,17,5,11,18,2,1,20,14};
        BuildBST tree = new BuildBST();
        Node root = tree.buildTree(arr);
        tree.inorderTraversal(root);
        System.out.println(tree.search(root, 18));
        Node UpdatedRoot = tree.delete(root, 1);
        tree.inorderTraversal(UpdatedRoot);
    }

}