class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int arr[]=new int[nums.length];
        int k=0;
        while(i<j){
            arr[k++]=nums[j--];
            arr[k++]=nums[i++];
        }
        if(i==j){
            arr[k]=nums[i];
        }
        long ans=0;
        for(int a=0;a<arr.length;a++){
            if(a%2==0){
                ans+=(long)Math.pow(arr[a],2);
            }
            else{
                ans-=(long)Math.pow(arr[a],2);
            }
        }
        return ans;
    }
}