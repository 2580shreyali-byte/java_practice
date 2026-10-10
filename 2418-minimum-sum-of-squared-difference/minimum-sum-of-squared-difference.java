class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        int k=k1+k2;
        int []diff=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            diff[i]=Math.abs(nums1[i]-nums2[i]);
            max=Math.max(diff[i],max);
        }
        int freq[]=new int[max+1];
        for(int d:diff){
            freq[d]++;
        }
        for(int d=max;d>0 && k>0;d--){
            if(freq[d]==0) continue;
            int reduce=Math.min(k,freq[d]);
            freq[d]-=reduce;
            freq[d-1]+=reduce;
            k-=reduce;
        }
        long ans=0;
        for(int d=0;d<freq.length;d++){
            ans+=(long)d*d*freq[d];
        }
        return ans;
    }
}