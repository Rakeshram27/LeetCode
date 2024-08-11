class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int r = 0,c = 0;
        for(String k : commands) {
            if(k.equals("UP")) r--;
            else if(k.equals("DOWN")) r++;
            else if(k.equals("LEFT")) c--;
            else if(k.equals("RIGHT")) c++;
        } 
        int ans = r * n + c;
        return ans;
    }
}