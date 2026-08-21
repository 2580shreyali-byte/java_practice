class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean freq[]=new boolean[256];
        for(int i=0;i<jewels.length();i++){
            freq[jewels.charAt(i)]=true;
        }
        int count=0;
        for(int i=0;i<stones.length();i++){
            if(freq[stones.charAt(i)]==true) count++;
        }
        return count;
    }
}
