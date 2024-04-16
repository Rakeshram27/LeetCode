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
    public TreeNode dfs(TreeNode root, int val, int depth, int cur) {
        if(root == null) return null;
        dfs(root.left, val, depth, cur + 1);
        dfs(root.right, val, depth, cur + 1);
        if(depth - 1 == cur){
            TreeNode temp = root;
            temp.left = new TreeNode(val, root.left, null);
            temp.right = new TreeNode(val, null, root.right);
            return root = temp;
        }
        return root;
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1) return new TreeNode(val, root, null);
        return dfs(root,val, depth, 1);
    }
}