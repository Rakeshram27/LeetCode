class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0 ) + 1);
        }
        List<Integer> ans = new ArrayList<>(map.keySet());
        Collections.sort(ans, (a,b) -> {
            int n1 = map.get(a);
            int n2 = map.get(b);
            if(n1 < n2) return -1;
            if(n1 > n2) return 1;
            return b - a;
        });
        int k = 0;
        for(int i : ans) {
            int val = map.get(i);
            for(int j = 0;j < val;j++) {
                nums[k++] = i;
            }
        }
        return nums;
    }
}