class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int total = 0; // total time taken
        for(int i = 0;i < tickets.length;i++) {
            if(i <= k) {
                total += Math.min(tickets[i] , tickets[k]);
            }
            else { 
                total += Math.min(tickets[k] - 1, tickets[i]);
            }
        }
        return total;
    }
}