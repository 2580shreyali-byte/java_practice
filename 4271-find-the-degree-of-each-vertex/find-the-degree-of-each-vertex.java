class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int vertex=0;
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1) vertex++;
            }
            ans[i]=vertex;
        }
        return ans;
    }
}