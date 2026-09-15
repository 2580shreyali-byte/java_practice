class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans=0;
        for(int i=low;i<=high;i++){
            int n=i;
            int count=0;
            while(n!=0){
                count++;
                n/=10;
            }
            if(count%2!=0){
                continue;
            }
            else{
                int leftsum=0,rightsum=0;
                n=i;
                int m=count/2;
                for(int j=0;j<m;j++){
                    rightsum+=n%10;
                    n/=10;
                }
                for(int j=0;j<m;j++){
                    leftsum+=n%10;
                    n/=10;
                }
                if(leftsum==rightsum){
                    ans++;
                }
            }
        }
        return ans;
    }
}