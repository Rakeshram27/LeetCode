class Solution {
    public long countCompleteDayPairs(int[] hours) {
        Map<Integer, Integer> map = new HashMap<>();
        long count = 0;
        for(int i : hours) {
            int k = i;
            k %= 24;
            if(map.containsKey(Math.abs(24 - k) % 24)) {
                count += map.get(Math.abs(24 - k) % 24);
            }
            map.put(k, map.getOrDefault(k, 0) + 1);
        }
        return count;
    }
}