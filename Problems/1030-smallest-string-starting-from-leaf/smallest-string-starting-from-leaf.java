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
    private StringBuilder sb;
    private String smallestPath;
    private void dfs(TreeNode node) {
        if (node != null) {
            sb.append((char) ('a' + node.val));
            if (node.left == null && node.right == null) {
                String leafToRootPath = sb.reverse().toString();
                if (leafToRootPath.compareTo(smallestPath) < 0) {
                    smallestPath = leafToRootPath;
                }
                sb.reverse();
            }
            dfs(node.left);
            dfs(node.right);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
   public String smallestFromLeaf(TreeNode root) {
        sb = new StringBuilder();
        smallestPath = String.valueOf((char) ('z' + 1));
        dfs(root);
        return smallestPath;        
    }
}