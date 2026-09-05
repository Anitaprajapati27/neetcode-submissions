class Solution {
    public void explore(int i,int j,int[][] heights,boolean[][] vis,int m,int n){
        if(i<0 || j<0 || i>=m || j>=n || vis[i][j])
        return;

        vis[i][j]=true;

        //left
        if(j-1>=0 && heights[i][j]<=heights[i][j-1]){
            explore(i,j-1,heights,vis,m,n);
        }
        //right
        if(j+1<n && heights[i][j]<=heights[i][j+1]){
            explore(i,j+1,heights,vis,m,n);
        }
        //up
        if(i-1>=0 && heights[i][j]<=heights[i-1][j]){
            explore(i-1,j,heights,vis,m,n);
        }
        //down
        if(i+1<m && heights[i][j]<=heights[i+1][j]){
            explore(i+1,j,heights,vis,m,n);
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res=new ArrayList<>();
        int m=heights.length;
        int n=heights[0].length;
        boolean[][] pac=new boolean[m][n];
        boolean[][] atl=new boolean[m][n];
        int i=0;
        for(int j=0;j<n;j++){
            if(!pac[i][j]){
                explore(i,j,heights,pac,m,n);
            }
        }
        int j=0;
        for(i=0;i<m;i++){
            if(!pac[i][j]){
                explore(i,j,heights,pac,m,n);
            }
        }
        i=m-1;
        for(j=0;j<n;j++){
            if(!atl[i][j]){
                explore(i,j,heights,atl,m,n);
            }
        }
        j=n-1;
        for(i=0;i<m;i++){
            if(!atl[i][j]){
                explore(i,j,heights,atl,m,n);
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(atl[i][j] && pac[i][j]){
                    List<Integer> p=new ArrayList<>();
                    p.add(i);
                    p.add(j);
                    res.add(new ArrayList<>(p));
                }
            }
        }
        return res;
    }
}
