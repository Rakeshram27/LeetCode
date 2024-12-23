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
    public int func(List<Integer> l1, List<Integer> l2) {
        if(l1.size() == 1) return 0;
        Collections.sort(l1);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < l1.size();i++) {
            map.put(l1.get(i), i);
        }
        int cnt = 0;
        for(int i = 0;i < l1.size(); ) {
            int idx = map.get(l2.get(i));
            if(idx == i) i++;
            else {
                cnt++;
                int tmp = l2.get(i);
                l2.set(i, l2.get(idx));
                l2.set(idx, tmp);
            }
        }
        return cnt;
    }
    public int minimumOperations(TreeNode root) {
        int cnt = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            List<Integer> l1 = new ArrayList<>();
            List<Integer> l2 = new ArrayList<>();
            int n = q.size();
            for(int i = 0;i < n;i++) {
                TreeNode tmp = q.poll();
                l1.add(tmp.val);
                l2.add(tmp.val);
                if(tmp.left != null) q.add(tmp.left);
                if(tmp.right != null) q.add(tmp.right);
            }
            cnt += func(l1, l2);
        }
        return cnt;
    }
}