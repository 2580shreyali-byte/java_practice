class Solution {
    public boolean isIsomorphic(String s, String t) {
        int arr[]=new int[256];
        int brr[]=new int[256];
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(arr[a]!=0 && arr[a]!=b){
                return false;
            }
            if(brr[b]!=0 && brr[b]!=a){
                return false;
            }
            arr[a]=b;
            brr[b]=a;
        }
        return true;
    }
}