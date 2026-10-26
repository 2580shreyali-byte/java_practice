class Solution {
    public String frequencySort(String s) {
        int freq[]=new int[256];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch]++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=s.length();i>0;i--){
            for(int j=0;j<256;j++){
                if(freq[j]==i){
                    for(int k=0;k<i;k++){
                        sb.append((char)j);
                    }
                }
            }
        }
        return sb.toString();
    }
}