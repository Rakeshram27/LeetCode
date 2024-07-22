class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String>  map = new HashMap<>();
        for(int i = 0;i < names.length;i++) {
            map.put(heights[i], names[i]);
        }
        int k = 0;
        Arrays.sort(heights);
        String[] ans = new String[heights.length];
        for(int i = heights.length - 1;i >= 0;i--) {
            ans[k] = map.get(heights[i]);
            k++;
        }
        return ans;
        // int n = names.length;  
        // String[][] people = new String[n][2];  
        
        // for (int i = 0; i < n; i++) {  
        //     people[i][0] = String.valueOf(heights[i]); 
        //     people[i][1] = names[i];
        // }  
        // Arrays.sort(people, new Comparator<String[]>() {  
        //     public int compare(String[] a, String[] b) {  
        //         return Integer.parseInt(b[0]) - Integer.parseInt(a[0]);
        //     }  
        // });

        // String[] ans = new String[n];  
        // for (int i = 0; i < n; i++) {  
        //     ans[i] = people[i][1];  
        // }  
        // return ans;        

    }
}