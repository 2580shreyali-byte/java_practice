class Solution {
    public boolean isMonotonic(int[] nums){
        boolean incr=false;
        boolean decr=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]) 
            incr=true;
            else if(nums[i]<nums[i-1])
            decr=true;
        } 
         
        return !(incr && decr);     
    }
}
