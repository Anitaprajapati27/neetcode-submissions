class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int freq[]=new int[26];
        int maxFreq=0;
        int n=s.length();
        int res=0;
        while(r<n){
            freq[s.charAt(r)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(r)-'A']);
            while((r-l+1)-maxFreq>k){
                freq[s.charAt(l)-'A']--;
                for(int i=0;i<26;i++){
                    maxFreq=Math.max(maxFreq,freq[i]);
                }
                l++;
            }
            if((r-l+1)-maxFreq<=k){
                res=Math.max(res,r-l+1);
            }
            r++;
        }
        return res;
    }
}
