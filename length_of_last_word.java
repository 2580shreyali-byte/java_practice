class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        int lastlength = 0;
        while(i>=0 && s.charAt(i)==' '){
          i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            lastlength++;
            i--;
        }
        return lastlength;
        
    }
}
