class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<nums.length;i++){
            rightsum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(i==0) leftsum=0;
            else{
            leftsum +=nums[i-1];
            }
            rightsum -= nums[i];
            arr[i]=Math.abs(leftsum - rightsum);
        }
        return arr;
    }
}
