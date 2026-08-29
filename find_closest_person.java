class Solution {
    public int findClosest(int x, int y, int z) {
        int c1=Math.abs(x-z);
        int c2=Math.abs(y-z);
        if(c1==c2) return 0;
        else if(c1<c2) return 1;
        else return 2;
    }
}
