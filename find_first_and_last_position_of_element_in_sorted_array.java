class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int idx1=-1, idx2=-1;
        int left=0, right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                idx1=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        left=0; right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                idx2=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return new int[]{idx1,idx2};
    }
}
