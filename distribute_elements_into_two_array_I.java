class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        int i=1;
        int j=1;
        while(i+j<n){
            if(arr1[i-1]>arr2[j-1]){
                arr1[i]=nums[i+j];
                i++;
            }
            else{
                arr2[j]=nums[i+j];
                j++;
            }
        }
        int ans[]=new int[n];
        for(int k=0;k<i;k++){
            ans[k]=arr1[k];
        }
        for(int k=0;k<j;k++){
            ans[k+i]=arr2[k];
        }
        return ans;
    }
}
