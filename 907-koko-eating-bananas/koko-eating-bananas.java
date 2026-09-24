class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int ele:piles){
            right=Math.max(right,ele);
        }
        while(left<right){
            int mid=left+(right-left)/2;
            int hours=0;
            for(int ele:piles){
                hours+=(int)Math.ceil((double)ele/mid);
            }
            if(hours<=h){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}