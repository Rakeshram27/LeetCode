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
class Solution {
    public void inorder(TreeNode root, List<Integer> sortedlist) {
        if(root == null) {
            return ;
        }
        inorder(root.left, sortedlist);
        sortedlist.add(root.val);
        inorder(root.right, sortedlist);
    }
    public TreeNode bst(List<Integer> list , int low, int high) {
        if(low > high) return null;
        int mid = (low + high) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = bst(list, low, mid - 1);
        root.right = bst(list,mid + 1, high);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> sortedlist = new ArrayList<>();
        inorder(root, sortedlist);
        return bst(sortedlist, 0, sortedlist.size() - 1);
    }
}