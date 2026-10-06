class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int maxar=Integer.MIN_VALUE;
        while(l<r){
            int minh=Math.min(height[l],height[r]);
            int area=minh*(r-l);
            maxar=Math.max(area,maxar);
            if(height[l]>height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return maxar;
    }
}