class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        //System.out.print(map);
        for(int i = 0;i < s.length();i++) {
            if(map.get(s.charAt(i)) == 1) return i;
        }
        return -1;

    //    int[] count = new int[26];
    //    for(int i = 0;i < s.length();i++){
    //        int in = s.charAt(i) - 'a';
    //        count[in]++;
    //    }
    //    for(int i = 0;i < s.length();i++){
    //        int in = s.charAt(i)-'a';
    //        if(count[in] == 1){
    //            return i;
    //        }
    //    }
    //    return -1;
       /*for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           if(s.indexOf(ch) == s.lastIndexOf(ch)){
               return i;
           }
       }
       return -1;*/
    }
}