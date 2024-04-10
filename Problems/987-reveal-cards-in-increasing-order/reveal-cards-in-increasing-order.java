class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] ans = new int[deck.length];
        int idx = 0, i = 0;
        boolean flag = false;
        while(idx < deck.length) {
            if(ans[i] == 0) {
                if(!flag) {
                    ans[i] = deck[idx];
                    idx++;
                }
                flag = !flag;
            }
            i = (i + 1) % deck.length;
        }
        return ans;
    }
}