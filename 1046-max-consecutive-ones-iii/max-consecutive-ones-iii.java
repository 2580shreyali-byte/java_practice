class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,maxlen=Integer.MIN_VALUE,countone=0,countzero=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==1){
                countone++;
            }
            else{
                countzero++;
            }
            while(countzero>k){
                if(nums[left]==0){
                    countzero--;
                }
                else countone--;
                left++;   
            }
            int len=countone+countzero;
            maxlen=Math.max(maxlen,len);
        }
        if(maxlen==Integer.MIN_VALUE) return 0;
        else return maxlen;
    }
}