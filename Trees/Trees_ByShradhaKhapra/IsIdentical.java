/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

//   LEETCODE 100

class isIdentical {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null || q == null){
            return p == q; 
            // yeh check kr rha hai ki, agar dono p and q, null hain toh woh true return kr dega warna false agar dono m se ek bhi null hai toh.
        }
        boolean isLeftIdentical = isSameTree(p.left, q.left);
        boolean isRightIdentical = isSameTree( p.right, q.right);

        return (isLeftIdentical && isRightIdentical && (p.val == q.val));
    }
}