class Solution {
    public int mirrorFrequency(String s) {
        int fchar[]=new int[26];
        int fdigit[]=new int[10];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)) fchar[ch-'a']++;
            else fdigit[ch-'0']++;
        }
        int ans=0;
        int left=0;
        int right=fchar.length-1;
        while(left<=right){
            ans+=Math.abs(fchar[left]-fchar[right]);
            left++;
            right--;
        }
        left=0;
        right=9;
        while(left<=right){
            ans+=Math.abs(fdigit[left]-fdigit[right]);
            left++;
            right--;
        }
        return ans;
    }
}
