class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int oddcount = 0;
        boolean flag = false;
        for(int i : arr) {
            if(i % 2 != 0) {
                oddcount++;
                if(oddcount == 3) {
                    flag = true;
                    break;
                }
            }
            else {
                oddcount = 0;
            }
        }
        if(flag) return true;
        return false;
    }
}