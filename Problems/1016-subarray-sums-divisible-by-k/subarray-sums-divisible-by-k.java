class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int pre = 0,count = 0;
        int[] prevf = new int[k];
        prevf[0] = 1;
        for(int num:nums){
            pre = (pre + num % k + k) % k;
            count = count + prevf[pre];
            prevf[pre]++;
        }
        return count;
        // int count = 0,sum = 0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         sum += nums[i];
        //         if(sum % k == 0){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}