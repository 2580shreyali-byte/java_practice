class Solution {
    public boolean isAnagram(String s, String t) {
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        if(s.length()!=t.length()) return false;
        else{
            for(int i=0;i<26;i++){
                for(int j=0;j<s.length();j++){
                int idx1=s.charAt(j)-'a';
                int idx2=t.charAt(j)-'a';
                arr1[idx1]++;
                arr2[idx2]++;
            }
        }
        }
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]) return false;
        }
            return true;
    }
}
