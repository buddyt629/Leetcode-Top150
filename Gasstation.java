class Gasstation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalgas=0;
        int start=0;
        int totalcost=0;
        for(int i=0;i<n;i++)
        {
            totalgas+=gas[i];
            totalcost+=cost[i];

        }
        if(totalgas<totalcost) return -1;

        int remaininggas=0;
        for(int i=0;i<n;i++)
        {
            remaininggas+=gas[i]-cost[i];
            if(remaininggas<0)
            {
                start=i+1;
                remaininggas=0;

            }
        }
        return start;
    }
}