class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0, sum=0, minlen=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                int len=right-left+1;
                minlen=Math.min(len,minlen);
                sum-=nums[left];
                left++;
            }
        }
        if(minlen==Integer.MAX_VALUE) return 0;
        else return minlen;
    }
}