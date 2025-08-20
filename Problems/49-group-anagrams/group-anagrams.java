class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();
        for(String s : strs) {
            int[] count = new int[26];
            for(char ch : s.toCharArray()) {
                count[ch - 'a']++;
            }
            String k = Arrays.toString(count);
            ans.putIfAbsent(k, new ArrayList<>());
            ans.get(k).add(s);
        }
        return new ArrayList<>(ans.values());
        /*if(strs.length == 0) return new ArrayList();
        Map<String, List> hm = new HashMap<String, List>();
        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String k = String.valueOf(c);
            if(!hm.containsKey(k)) hm.put(k, new ArrayList());
            hm.get(k).add(s);
        }
        return new ArrayList(hm.values());*/
    }
}