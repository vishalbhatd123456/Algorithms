class Solution {
    public int networkDelayTime(int[][] times, int N, int K) {
        int[] dist = new int[N+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        //make the source path as 0 from the start
        dist[K] = 0;
        for(int i = 0;i<N;i++)
        {
            for(int[] step: times)
            {
                int u = step[0];
                int v = step[1];
                int w = step[2];
                
                if(dist[u]!=Integer.MAX_VALUE && dist[u] + w < dist[v])
                {
                    dist[v] = dist[u] + w; //update the max value if at all the weight is less
                }
        }
    }
        int res = 0;
        for(int i = 1;i<=N;i++)
        {
            res = Math.max(res,dist[i]);
        }
        
        return res == Integer.MAX_VALUE?-1:res;
}
}
