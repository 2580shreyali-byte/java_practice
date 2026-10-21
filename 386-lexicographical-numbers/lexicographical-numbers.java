class Solution {
    public List<Integer> lexicalOrder(int n) {
        List <Integer> list=new ArrayList<>();
        Lexicographical(n,0,list);
        return list;
    }
    public static void Lexicographical(int n,int curr,List<Integer> list){
        if(curr>n){
            return;
        }
        if(curr!=0){
            list.add(curr);
        }
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            Lexicographical(n,curr*10+i,list);
        }
    }
}