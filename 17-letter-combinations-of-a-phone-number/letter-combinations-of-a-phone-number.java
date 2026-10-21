class Solution {
    public List<String> letterCombinations(String digits){
        List<String> list= new ArrayList<>();
        if(digits.length()==0){
            return list;
        }
        key_pad(digits,"",list);
        return list;
        
    }
    public static void key_pad(String ques, String ans,List<String>list){
        if(ques.length()==0){
            list.add(ans);
            return;
        }
         String[] keypad = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        
        char ch= ques.charAt(0);
        String s= keypad[ch-'0'];
        for(int i=0;i<s.length();i++){
            key_pad(ques.substring(1), ans+s.charAt(i), list);
        }
    }
    
}