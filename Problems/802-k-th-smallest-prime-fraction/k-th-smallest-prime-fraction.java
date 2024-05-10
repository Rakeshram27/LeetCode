class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Map<Double, int[]>map= new TreeMap<>();
        for(int i = 0; i< arr.length; i++) {
            for(int j = i+ 1;j< arr.length; j++) {
                    double num = arr[i];
                    double deno = arr[j];
                    double d = (double)(num / deno);
               map.put(d, new int[]{arr[i], arr[j]});
            }
        }
        int count = 0;
        for(double key: map.keySet())
        {
            count++;
            if(count == k)
            {
                return map.get(key);
            }
        }
        return null;
    }
}