class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i==j)
                continue;
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        int i=0;
        int j=n-1;
        while(i<j){
            for(int k=0;k<n;k++){
                int t=matrix[k][i];
                matrix[k][i]=matrix[k][j];
                matrix[k][j]=t;
            }
            i++;
            j--;
        }
    }
}
