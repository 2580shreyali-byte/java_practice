class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        int right=capacity.length-1;
        int count=1,ans=0;
        while(right>=0){
            ans+=capacity[right];
            if(sum<=ans){
                return count;
            }
            count++;
            right--;
        }
        return count;
    }
}