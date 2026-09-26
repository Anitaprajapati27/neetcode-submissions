class Solution {
    public int solve(int i,int j,String w1,String w2,int[][] dp){
        if(i>=w1.length() && j>=w2.length()){
            return 0;
        }
        if(i>=w1.length()){
            return w2.length()-j;
        }
        if(j>=w2.length()){
            return w1.length()-i;
        }

        if(dp[i][j]!=-1)
        return dp[i][j];

        int res=0;
        if(w1.charAt(i)==w2.charAt(j)){
            res=solve(i+1,j+1,w1,w2,dp);
        }else{
res=1+Math.min(solve(i,j+1,w1,w2,dp),Math.min(solve(i+1,j,w1,w2,dp),solve(i+1,j+1,w1,w2,dp)));
        }
        return dp[i][j]=res;
    }
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[n][m];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return solve(0,0,word1,word2,dp);
    }
}
