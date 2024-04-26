class Solution {
    Set<Integer> set = new HashSet<>();
    public int maximumPrimeDifference(int[] nums) {
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(11);
        set.add(13);
        set.add(17);
        set.add(19);
        set.add(23);
        set.add(29);
        set.add(31);
        set.add(37);
        set.add(41);
        set.add(43);
        set.add(47);
        set.add(53);
        set.add(59);
        set.add(61);
        set.add(67);
        set.add(71);
        set.add(73);
        set.add(79);
        set.add(83);
        set.add(89);
        set.add(97);
        int i = 0, j = nums.length - 1;
        while(i < nums.length) {
            if(set.contains(nums[i])) {
                break;
            }
            i++;
        }
        while(j > 0) {
            if(set.contains(nums[j])) {
                break;
            }
            j--;
        }
        return j - i;
    }
}