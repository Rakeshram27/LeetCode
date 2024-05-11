class Solution {
     class Worker {
        double qr; //Qualityratio
        int quality;
        Worker(int quality, int wage) {
            this.quality = quality;
            this.qr = (double) wage / quality;
        }
    }
    public double mincostToHireWorkers(int[] quality, int[] wages, int cost) {
         int n = quality.length;
        Worker[] workers = new Worker[n];
        for (int i = 0; i < n; ++i) {
            workers[i] = new Worker(quality[i], wages[i]);
        }
        Arrays.sort(workers, (a, b) -> Double.compare(a.qr, b.qr));
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        double minCost = Double.MAX_VALUE;
        int totalQuality = 0;
        for (Worker worker : workers) {
            totalQuality += worker.quality;
            pq.offer(worker.quality);
            if (pq.size() == cost) {
                minCost = Math.min(minCost, totalQuality * worker.qr);
                totalQuality -= pq.poll();
            }
        }
        return minCost;
        // int n = wages.length;
        // double worker[][] = new double[n][2];
        // for(int i=0;i<n;i++) 
        // {
        //     double profit = wages[i] / (quality[i] * 1.0);
        //     worker[i][0] = profit;
        //     worker[i][1] = quality[i];
        // }
        // Arrays.sort(worker,(a,b)->a[0]>b[0]?1:-1);
        // PriorityQueue<Double> pq = new PriorityQueue<>();
        // double ans = Double.MAX_VALUE;
        // double totalWage = 0;
        // for (double[] a:worker) 
        // {
	    //     if (pq.size() == cost) 
        //     totalWage -= pq.poll();
            
	    //     pq.add(a[1]);
	    //     totalWage = (totalWage + a[1]);
            
	    //     if(pq.size()  == cost)
        //     {
        //         double t = (totalWage * a[0]);
        //         ans = Math.min(ans, t);
        //     }
        // }
        // return ans;
    }
}