class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        boolean[]row=new boolean[m];
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count==1){
                row[i]=true;
            }
        }
        boolean[]col=new boolean[n];
        for(int j=0;j<n;j++){
            int count=0;
            for(int i=0;i<m;i++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count==1){
                col[j]=true;
            }
        }
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1 && row[i]==true && col[j]==true){
                    ans++;
                }
            }
        }
        return ans;
    }
}