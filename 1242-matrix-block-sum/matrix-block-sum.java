class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int[][]ans=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=sum(i,j,k,mat);
            }
        }
        return ans;
    }
    public int sum(int r,int c,int k,int[][]mat){
        int sr=Math.max(0,r-k);
        int sc=Math.max(0,c-k);
        int er=Math.min(r+k,mat.length-1);
        int ec=Math.min(c+k,mat[0].length-1);
        int s=0;
        for(int i=sr;i<=er;i++){
            for(int j=sc;j<=ec;j++){
                s+=mat[i][j];
            }
        }
        return s;
    }
}