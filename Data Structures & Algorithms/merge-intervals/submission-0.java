class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>> ls=new ArrayList<>();
        for(int[] curr:intervals){
            int st=curr[0];
            int en=curr[1];
            if(ls.size()==0 || ls.get(ls.size()-1).get(1)<st){
                ls.add(Arrays.asList(st,en));
            }else{
                ls.get(ls.size()-1).set(1,Math.max(ls.get(ls.size()-1).get(1),en));
            }
        }
        int[][] res=new int[ls.size()][2];
        int i=0;
        for(List<Integer> l:ls){
            res[i][0]=l.get(0);
            res[i][1]=l.get(1);
            i++;
        }
        return res;
    }
}
