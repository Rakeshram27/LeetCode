class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            int k = target - nums[i];
            if(map.containsKey(k)) {
                return new int[] {map.get(k), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0};

    }
}