class Solution {
    public boolean binarySearch(int[] arr,int n,int tar){
        int l=0;
        int r=n-1;
        while(l<=r){
            int m=(r+l)/2;
            if(arr[m]==tar)
            return true;

            if(arr[m]<tar){
                l=m+1;
            }else{
                r=m-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int j=n-1;
        while(i<m){
            if(matrix[i][0]<=target && matrix[i][j]>=target){
                return binarySearch(matrix[i],n,target);
            }
            i++;
        }
        return false;
    }
}
