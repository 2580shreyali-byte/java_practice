class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int ans[]=new int[n];
        int maxele=-1;
        ans[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            maxele=Math.max(maxele,arr[i+1]);
            ans[i]=maxele;
        }
        return ans;
    }
}