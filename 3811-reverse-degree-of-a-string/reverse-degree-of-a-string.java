class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int index=123-s.charAt(i);
            int idx=i+1;
            int product=idx*index;
            sum+=product;
        }
        return sum;
    }
}