class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int[] res = new int[2];
        int k = 0;
        for(int i = 0;i < nums.length;i++) {
            if(st.contains(nums[i]) && !st.isEmpty()) {
                res[k++] = nums[i];
            }else {
                st.add(nums[i]);
            }
        }
        return res;
    }
}