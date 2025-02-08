class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length == 1) return 1;
        int max = 1, curr = 1;
        Boolean inc = null;
        for(int i = 1;i < nums.length;i++) {
            if(nums[i] > nums[i - 1]) {
                if(inc == null || inc == true) {
                    curr++;
                    inc = true;
                }
                else {
                    curr = 2;
                    inc = true;
                }
            }
            else if(nums[i] < nums[i - 1]) {
                if(inc == null || inc == false) {
                    curr++;
                    inc = false;
                }
                else {
                    curr = 2;
                    inc = false;
                }
            }
            else {
                curr = 1;
                inc = null;
            }
            max = Math.max(max, curr);
        }
        return max;
        // int max = 1, increasing = 1, decreasing = 1;
        // for(int i = 1;i < nums.length;i++) {
        //     if(nums[i] > nums[i - 1]) {
        //         increasing = decreasing + 1;
        //         decreasing = 1;
        //     }
        //     else if(nums[i] < nums[i - 1]) {
        //         decreasing = increasing + 1;
        //         increasing = 1;
        //     }
        //     else {
        //         increasing = 1;
        //         decreasing = 1;
        //     }
        //     max = Math.max(max,Math.max(increasing, decreasing));
        // }
        // return max;
    }
}