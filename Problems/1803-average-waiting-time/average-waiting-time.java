class Solution {
    public double averageWaitingTime(int[][] customers) {
        long waitingTime = 0, current = 0;
        for(int[] cust : customers) {
            if(current < cust[0]) current = cust[0] + cust[1];
            else current = current + cust[1];
            long wait = current - cust[0];
            waitingTime += wait;
        } 
        double ans = (double)waitingTime / customers.length;
        return ans;
    }
}