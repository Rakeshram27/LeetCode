import java.util.*;
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        for(int i : hand) {
            //hm.put(i, hm.getOrDefault(i, 0) + 1);
            if(!hm.containsKey(i)){
                hm.put(i, 1);
            }
            else {
                hm.replace(i, hm.get(i) + 1);
            }
        }
        while(!hm.isEmpty()) {
            int first = hm.firstKey();
            for(int i = first;i < first + groupSize;i++) {
                if(!hm.containsKey(i)) return false;
                int count = hm.get(i);
                if (count == 1) {
                    hm.remove(i);
                } else {
                    hm.put(i, count - 1);
                }
                // hm.put(i, hm.get(i) - 1);
                // if (hm.get(i) == 0) {
                //      hm.remove(i);
                // }
            }
        }
        return true;
    }
}