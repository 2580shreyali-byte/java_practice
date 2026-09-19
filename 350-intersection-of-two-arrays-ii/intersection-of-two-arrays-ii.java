class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        ArrayList <Integer> arr=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int n=arr.size();
        int k=0;
        int ans[]=new int[n];
        for(int ele:arr){
            ans[k++]=ele;
        }
        return ans;
    }
}