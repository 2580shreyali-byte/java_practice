class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<=i;j++){
                max=Math.max(nums[j],max);
            }
            int min=Integer.MAX_VALUE;
            for(int m=i;m<n;m++){
                min=Math.min(nums[m],min);
            }
            ans[i]=max-min;
        }
        for(int i=0;i<n;i++){
            if(ans[i]<=k) return i;
        }
        return -1;
    }
}