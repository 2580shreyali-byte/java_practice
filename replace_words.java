class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String words[]= sentence.split(" ");
        for(int i=0;i<words.length;i++){
            String rootwords=words[i];
            for(String root:dictionary){
                if(words[i].startsWith(root)){
                    if(rootwords.equals(root) || rootwords.length()>root.length()){
                        rootwords=root;
                    }
                }
                words[i]=rootwords;
            }
        }
        StringBuilder s= new StringBuilder();
        for(int i=0;i<words.length;i++){
            s.append(words[i]);
            if(i!=words.length-1){
                s.append(" ");
            }
        }
        return s.toString();
    }
}
