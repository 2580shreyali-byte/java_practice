class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<s.length();i++){
            int idx1=s.charAt(i)-'a';
            int idx2=t.charAt(i)-'a';
            a[idx1]++;
            b[idx2]++;
        }
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}