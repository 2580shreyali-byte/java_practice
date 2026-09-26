class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high=high+weights[i];
        } 
        while(low<=high){
            int mid=low+(high-low)/2;
            int currentweight=0;
            int countdays=1;
            for(int i=0;i<weights.length;i++){
                if(currentweight+weights[i]<=mid){
                    currentweight+=weights[i];
                }
                else{
                    countdays++;
                    currentweight=weights[i];
                }
            }
            if(countdays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}