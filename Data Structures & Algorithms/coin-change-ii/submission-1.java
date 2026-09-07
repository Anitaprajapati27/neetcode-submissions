class Solution {
    public int explore(int amt,int idx,int[] coins,int[][] dp){
        if(idx>=coins.length){
            if(amt==0)
            return 1;

            return 0;
        }

        if(dp[idx][amt]!=-1)
        return dp[idx][amt];
        int pick=explore(amt,idx+1,coins,dp);
        int np=0;
        if(amt>=coins[idx]){
            np=explore(amt-coins[idx],idx,coins,dp);
        }
        return dp[idx][amt]=pick+np;
    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp=new int[n][amount+1];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return explore(amount,0,coins,dp);
    }
}
