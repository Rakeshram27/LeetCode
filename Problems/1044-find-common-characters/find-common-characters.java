class Solution {
    public List<String> commonChars(String[] words) {
       /* String s = words[0];
        List<String> list = new ArrayList<>();
        for(char ch : s.toCharArray()){
            int count = 0;
            for(int i = 1;i < words.length;i++){
                char[] h = words[i].toCharArray();
                for(int j = 0;j < h.length;j++){
                    if(ch == h[j]){
                        count++;
                        h[j] = '-';
                        break;
                    }
                }
                String res = "";
                for(char e : h){
                    res += e + "";
                }
                words[i] = res;
            }
           if(count == words.length-1){
               list.add(ch + "");
           }
        }
        return list;*/
        List<String> ans = new ArrayList<>();
        int[] count = new int[26]; 
        Arrays.fill(count, Integer.MAX_VALUE);
        for (String str : words) {
            int[] cnt = new int[26];
            str.chars().forEach(c -> ++cnt[c - 'a']); 
            for (int i = 0; i < 26; ++i) { 
                count[i] = Math.min(cnt[i], count[i]); 
            }
        }
        for (char c = 'a'; c <= 'z'; ++c) {
            while (count[c - 'a']-- > 0) {
                 ans.add("" + c); 
                 }
        }
        return ans;
    }
}