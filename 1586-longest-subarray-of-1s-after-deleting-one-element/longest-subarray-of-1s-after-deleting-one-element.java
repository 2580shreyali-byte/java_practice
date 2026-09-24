class Solution {
    public int longestSubarray(int[] nums) {
        int left=0,countzero=0,countone=0,maxlen=Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                countzero++;
            }
            else{
                countone++;
            }
            while(countzero>1){
                if(nums[left]==1)countone--;
                else countzero--;
                left++;
            }
            int len=right-left+1;
            maxlen=Math.max(len,maxlen);
        }
        return maxlen-1;
    }
}