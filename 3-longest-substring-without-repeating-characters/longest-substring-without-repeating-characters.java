class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set=new HashSet<>();
        int l=0;
        int maxlen=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
            int len=i-l+1;
            maxlen=Math.max(maxlen,len);
        }
        if(maxlen==Integer.MIN_VALUE) return 0;
        return maxlen;
    }
}