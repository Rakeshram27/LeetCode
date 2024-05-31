class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int count = 0, prefix = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        Map<Integer, Integer> totalmap = new HashMap<>();
        for(int i = 0;i < n;i++) {
            prefix ^= arr[i];
            count += map.getOrDefault(prefix, 0) * i - totalmap.getOrDefault(prefix, 0);
            totalmap.put(prefix, totalmap.getOrDefault(prefix, 0) + i + 1);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}