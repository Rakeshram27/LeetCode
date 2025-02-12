class Solution {
    public int SumDigit(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int max = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            int sum = SumDigit(i);
            if(map.containsKey(sum)) {
                max = Math.max(max, i + map.get(sum));
                map.put(sum, Math.max(map.get(sum), i));
            }
            else {
                map.put(sum, i);
            }
        }
        return max;
    }
}