class Solution {
    public int solve(int i,int j,String t1,String t2,int[][] dp){
        if(i<0 || j<0)
        return 0;

        // if(i<0 || j<0)
        // return Integer.MIN_VALUE;

        if(dp[i][j]!=-1)
        return dp[i][j];

        if(t1.charAt(i)==t2.charAt(j)){
            return dp[i][j]=1+solve(i-1,j-1,t1,t2,dp);
        }else{
            return dp[i][j]=Math.max(solve(i-1,j,t1,t2,dp),solve(i,j-1,t1,t2,dp));
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()][text2.length()];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        return solve(text1.length()-1,text2.length()-1,text1,text2,dp);
    }
}
