class Solution {
    public int maxSubArray(int[] nums) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        boolean neg = true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0) neg=false;
        }
        if(neg==true){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        for(int i=0;i<nums.length;i++){
            cs=cs+nums[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms,cs);
        }
        return ms;
    }
}
