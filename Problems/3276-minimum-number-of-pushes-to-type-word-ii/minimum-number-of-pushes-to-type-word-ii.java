class Solution {
     public int minimumPushes(String s) {
         int[] freq = new int[26];
        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        Arrays.sort(freq);
        int ans = 0,val = 1;
        int count = 0;
        int n = freq.length;
        for(int i = n - 1;i >= 0;i--) {
            if(freq[i] == 0) break;
            if(count < 8) {
                ans = ans + (val * freq[i]);
                count++;
            }
            else {
                val++;
                count = 1;
                ans = ans + (val * freq[i]);
            }
        }
        return ans;
        //  char[] ch = word.toCharArray();
        //  Arrays.sort(ch);
        //  String sort = new String(ch);
        //  Map<Character, Long> hm = sort.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c ->c,Collectors.counting()));
        //  long[][] freq = new long[hm.size()][2];
        //  int idx = 0;
        //  for(Map.Entry<Character,Long> entry: hm.entrySet()) {
        //      freq[idx][0] = entry.getValue();
        //      freq[idx][1] = (long) entry.getKey();
        //      idx++;
        //  }
        //  Arrays.sort(freq, (a,b)->Long.compare(b[0],a[0]));
        //  int res = 0, count = 0;
        //  for(long[] pair : freq) {
        //      count++;
        //      if(count < 9) res += pair[0];
        //      else if(count < 17) res += pair[0] * 2;
        //      else if(count < 25) res += pair[0] * 3;
        //      else res += pair[0] * 4;
        //  }
        //  return res;
    //     int n = word.length();
    //     int[] arr = new int[26];
    //     Map<Character, Integer> hm = new HashMap<>();
    //     if(n <= 8) return n;
    //     for(char ch : word.toCharArray()) {
    //         if(!hm.containsKey(ch)) hm.put(ch,1);
    //         else hm.put(ch, hm.get(ch) + 1);
    //     }
    //     for(Map.Entry<Character, Integer>e : hm.entrySet()) {
    //         arr[e.getKey() - 'a'] = e.getValue();
    //     }
    //     int ans = 0;
    //     for(int i = 0;i < 26;i++) {
    //         ans += arr[i];
    //     }
    //     return ans;
    }
}