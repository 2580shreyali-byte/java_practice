class Solution {
    public int pivotInteger(int n) {
        int left=1,right=n;
        int mid=n/2;
        while(mid<=n){
            int lsum=0,rsum=0;
            for(int i=1;i<=mid;i++){
                lsum+=i;
            }
            for(int i=mid;i<=n;i++){
                rsum+=i;
            }
            if(lsum==rsum){
                return mid;
            }
            mid++;
        }
        return -1;
    }
}