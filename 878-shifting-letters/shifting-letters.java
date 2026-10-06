class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n=shifts.length;
        int rsum[]=new int[n];
        rsum[n-1]=shifts[n-1];
        for(int i=n-2;i>=0;i--){
            rsum[i]=(rsum[i+1]+shifts[i])%26;
        }
        String ans="";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            ch=(char)('a'+(ch-'a'+rsum[i])%26);
            ans+=ch;
        }
        return ans;
    }
}