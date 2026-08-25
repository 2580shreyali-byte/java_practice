class Solution {
    public int digitFrequencyScore(int n) {
        int freq[]=new int[10];
        for(int i=0;i<freq.length;i++){
            freq[n%10]++;
            n/=10;
        }
        int ans=0;
        for(int i=0;i<freq.length;i++){
            ans+=freq[i]*i;
        }
        return ans;
    }
}
