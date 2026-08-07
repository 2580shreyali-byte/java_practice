class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int ans=1;
            int num=n;
            int dig=num;
            while(num!=0){
                int temp=num%10;
                ans*=temp;
                num/=10;
            }
            if(ans%t==0) return dig;
            else num=n++;
        }
    }
}
