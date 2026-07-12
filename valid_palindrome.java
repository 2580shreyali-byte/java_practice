class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char arr[]=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(char c:arr){
            if(Character.isLetterOrDigit(c)) sb.append(c);
        }
        String original=sb.toString();
        String reversed=sb.reverse().toString();
        return original.equals(reversed);
    }
}
