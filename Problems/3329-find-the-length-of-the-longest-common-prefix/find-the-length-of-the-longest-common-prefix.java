class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Map<String, Integer> hm = new HashMap<>();
        for(int n : arr1) {
            String str = String.valueOf(n);
            for(int i = 1;i <= str.length();i++) {
                hm.put(str.substring(0, i), hm.getOrDefault(str.substring(0,i),0) + 1);
            }
        }
        int max = 0;
        for(int n : arr2) {
            String val = String.valueOf(n);
            for(int i = 1;i <= val.length();i++) {
                if(hm.containsKey(val.substring(0,i))) {
                    max = Math.max(max,i);
                }
                else {
                    break;
                }
            }
        }
        return max;
    }
}