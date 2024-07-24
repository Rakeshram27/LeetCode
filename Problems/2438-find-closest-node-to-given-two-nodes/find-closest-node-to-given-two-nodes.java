class Solution {
    public void dfs(int node, int[] edges, int[] dist, boolean[] visited, int dis) {
        if(visited[node]) return;
        visited[node] = true;
        dist[node] = dis;
        if(edges[node] != -1 && !visited[edges[node]]) {
            //dist[edges[node]] = edges[node] + 1;
            dfs(edges[node], edges, dist, visited, dis + 1);
        }
    }
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dist1 = new int[n];
        int[] dist2 = new int[n];
        Arrays.fill(dist1, Integer.MAX_VALUE);
        Arrays.fill(dist2, Integer.MAX_VALUE);
        // dist1[node1] = 0;
        // dist2[node2] = 0;
        int ans = -1;
        int min = Integer.MAX_VALUE;
        boolean[] visited1 = new boolean[n];
        boolean[] visited2 = new boolean[n];
        dfs(node1, edges, dist1, visited1, 0);
        dfs(node2, edges, dist2, visited2, 0);
        for(int i = 0;i < n;i++) {
            if(dist1[i] != Integer.MAX_VALUE && dist2[i] != Integer.MAX_VALUE) {
                int max = Math.max(dist1[i], dist2[i]);
                //System.out.print(max+" ");
                if(min > max) {
                    min = max;
                    ans = i;
                }
                else if(min == max && i < ans) {
                    ans = i;
                }
                //System.out.print(ans+" ");
            }
        }
        return ans;
    }
}