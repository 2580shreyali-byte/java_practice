class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb=new StringBuilder();
        char arr[]=s.toCharArray();
        for(char ch:arr){
            int n=sb.length();
            if(n>=2 && sb.charAt(n-1)==ch && sb.charAt(n-2)==ch){
                continue;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
