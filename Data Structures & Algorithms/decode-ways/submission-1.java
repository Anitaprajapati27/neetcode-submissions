class Solution {
    public int dfs(int idx,String s,int[] dp){
        if(idx>=s.length())
        return 1;
        if(s.charAt(idx)=='0')
        return 0;

        if(dp[idx]!=-1)
        return dp[idx];

        int res=dfs(idx+1,s,dp);
        if(idx<s.length()-1){
            if(s.charAt(idx)=='1' || (s.charAt(idx)=='2' && s.charAt(idx+1)<'7')){
                res+=dfs(idx+2,s,dp);
            }
        }
        return dp[idx]=res;
    }
    public int numDecodings(String s) {
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return dfs(0,s,dp);
    }
}
