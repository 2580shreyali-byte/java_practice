class Solution {
    public int passwordStrength(String password) {
        int upper[]=new int[26];
        int lower[]=new int[26];
        int digit[]=new int[10];
        int special[]=new int[4];
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(Character.isUpperCase(ch)) upper[ch-'A']++;
            else if(Character.isLowerCase(ch)) lower[ch-'a']++;
            else if(Character.isDigit(ch)) digit[ch-'0']++;
            else if(ch=='!') special[0]++;
            else if(ch=='@') special[1]++;
            else if(ch=='#') special[2]++;
            else special[3]++;
        }
        int u=0; int l=0; int d=0; int s=0;
        for(int i=0;i<26;i++){
            if(upper[i]!=0) u++;
            if(lower[i]!=0) l++;
        }
        u*=2;
        l*=1;
        for(int i=0;i<10;i++){
            if(digit[i]!=0) d++;
        }
        d*=3;
        for(int i=0;i<4;i++){
            if(special[i]!=0) s++;
        }
        s*=5;
        int ans=u+l+d+s;
        return ans;
    }
}
