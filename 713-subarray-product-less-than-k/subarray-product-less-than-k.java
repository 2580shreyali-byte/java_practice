class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int si=0,ei=0,p=1,ans=0;
        while(ei<nums.length){
            p=p*nums[ei];
            while(p>=k && si<=ei){
                p=p/nums[si];
                si++;
            }
            int window=ei-si+1;
            ans=ans+window;
            ei++;
        }
        return ans;
    }
}