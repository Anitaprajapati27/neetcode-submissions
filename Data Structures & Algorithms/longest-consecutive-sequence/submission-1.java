class Solution {
    public int longestConsecutive(int[] nums) {
        int c=0;
        Set<Integer> st=new HashSet<>();
        for(int it:nums){
            st.add(it);
        }
        for(int it:st){
            int curr=it;
            int t=1;
            if(st.contains(curr-1))
            continue;
            while(st.contains(curr+1)){
                curr=curr+1;
                t++;
            }
            c=Math.max(c,t);
        }
        return c;
    }
}
