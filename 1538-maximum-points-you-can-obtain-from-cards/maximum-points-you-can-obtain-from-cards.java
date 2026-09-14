class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int max=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
            max=Math.max(max,sum);
        }
        int left=k-1;
        int right=cardPoints.length-1;
        while(left>=0){
            sum=sum+cardPoints[right]-cardPoints[left];
            max=Math.max(sum,max);
            left--;
            right--;
        }
        return max;
    }
}