class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int arr[]=new int[m];
        for(int i=0;i<m;i++){
            int sol=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    sol++;
                }
                else break;
            }
            arr[i]=sol;
        }
        int l=0,j=0;
        int ans[]=new int[m];
        while(l<=100){
            for(int i=0;i<m;i++){
                if(arr[i]==l){
                    ans[j]=i;
                    j++;
                }
            }
            l++;
        }
        int aans[]=new int[k];
        for(int i=0;i<k;i++){
            aans[i]=ans[i];
        }
        return aans;
    }
}