class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int ml=Integer.MAX_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                sum-=nums[i];
                ml=Math.min(j-i+1,ml);
                i++;
            }
            j++;
        }
        if(ml==Integer.MAX_VALUE){
            return 0;
        }
        return ml;
    }
}