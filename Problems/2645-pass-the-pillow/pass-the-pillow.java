class Solution {
    public int passThePillow(int n, int time) {
        int position = 0;
        boolean flag = true;
        for(int i = 0;i < time;i++) {
            if(position == 0) {
                flag = true;
            }
            else if(position == n - 1) {
                flag = false;
            }
            if(flag) position++;
            else position--;
        }
        return position + 1;
    }
}