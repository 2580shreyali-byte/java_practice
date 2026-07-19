class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int j=0,ri=0,li=0;
            int k=i+1;
            while(j<i){
                li+=nums[j];
                j++;
            }
            while(k>i && k<nums.length){
                ri+=nums[k];
                k++;
            }
            if(ri==li) return i;
        }
        return -1;
    }
}
