class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int freq[]=new int[1001];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    freq[nums1[i]]++;
                }
            }
        }
        int count=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0) count++;
        }
        int ans[]=new int[count];
        int i=0;
        for(int k=0;k<freq.length;k++){
            if(freq[k]!=0){
                ans[i]=k;
                i++;
            }
        }
        return ans;
    }
}
