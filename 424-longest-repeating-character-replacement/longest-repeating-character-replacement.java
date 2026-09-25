class Solution {
    public int characterReplacement(String s, int k) {
        HashMap <Character,Integer> map=new HashMap<>();
        int left=0,maxlen=0,maxfreq=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch));
            while((right-left+1)-maxfreq>k){
                char cl=s.charAt(left);
                map.put(cl,map.get(cl)-1);
                if(map.get(cl)==0){
                    map.remove(cl);
                }
                left++;
            }
            int len=right-left+1;
            maxlen=Math.max(len,maxlen);
        }
        return maxlen;
    }
}