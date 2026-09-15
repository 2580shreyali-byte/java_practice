class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0,zeroes=0,n=nums.length,maxlen=0;
        while(right<n){
            if(nums[right]==0){
                zeroes++;
            }
            if(zeroes<=k){
                int len=right-left+1;
                maxlen=Math.max(len,maxlen);
            }
            right++;
            while(zeroes>k){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }
        }
        return maxlen;
    }
}