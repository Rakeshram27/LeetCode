class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        List<String> list = new ArrayList<>();
        for(int i = 0;i < arr.length;i++) {
            if(map.get(arr[i]) == 1) {
                list.add(arr[i]);
            }
        }
        int val = k - 1;
        for(int i = 0;i < list.size();i++) {
            if(val == i) {
                return list.get(i);
            }
        }
        return "";
    }
}