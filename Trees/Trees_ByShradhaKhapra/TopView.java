public class TopView{

    private static class NodeHD {
        TreeNode node;
        int hd;
        NodeHD(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
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

    public List<Integer> topView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Map<Integer, Integer> hdToVal = new TreeMap<>();

        Queue<NodeHD> q = new LinkedList<>();
        q.add(new NodeHD(root, 0));

        while (!q.isEmpty()) {
            NodeHD cur = q.poll();
            int hd = cur.hd;
            TreeNode node = cur.node;

            if (!hdToVal.containsKey(hd)) {
                hdToVal.put(hd, node.val);
            }

            if (node.left != null) {
                q.add(new NodeHD(node.left, hd - 1));
            }
            if (node.right != null) {
                q.add(new NodeHD(node.right, hd + 1));
            }
        }

        for (int val : hdToVal.values()) {
            ans.add(val);
        }
        return ans;
    }

}