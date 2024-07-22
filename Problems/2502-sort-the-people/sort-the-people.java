class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;  
        String[][] people = new String[n][2];  
        
        for (int i = 0; i < n; i++) {  
            people[i][0] = String.valueOf(heights[i]); 
            people[i][1] = names[i];
        }  
        Arrays.sort(people, new Comparator<String[]>() {  
            public int compare(String[] a, String[] b) {  
                return Integer.parseInt(b[0]) - Integer.parseInt(a[0]);
            }  
        });

        String[] ans = new String[n];  
        for (int i = 0; i < n; i++) {  
            ans[i] = people[i][1];  
        }  
        return ans;        
    }
}