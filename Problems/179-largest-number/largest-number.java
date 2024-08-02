class Solution {
    public String largestNumber(int[] nums) {
        String[] str = Arrays.stream(nums).mapToObj(Integer::toString).toArray(String[]::new);
        Arrays.sort(str, (a,b) -> {
            String s1 = a + b;
            String s2 = b + a;
            return s1.compareTo(s2) > 0 ? -1 : 1;
        });
        if(str[0].equals("0")) return "0";
        //System.out.print(Arrays.toString(str));
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < str.length;i++) {
            sb.append(str[i]);
        }
        return sb.toString();
    }
}