class Solution {
    public int totalFruit(int[] fruits) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int left=0,maxlen=Integer.MIN_VALUE;
        for(int right=0;right<fruits.length;right++){
            int rele=fruits[right];
            map.put(rele,map.getOrDefault(rele,0)+1);
            while(map.size()>2){
                int lele=fruits[left];
                map.put(lele,map.get(lele)-1);
                if(map.get(lele)==0){
                    map.remove(lele);
                }
                left++;
            }
            int len=right-left+1;
            maxlen=Math.max(maxlen,len);
        }
        if(maxlen==Integer.MIN_VALUE) return 0;
        else return maxlen;
    }
}