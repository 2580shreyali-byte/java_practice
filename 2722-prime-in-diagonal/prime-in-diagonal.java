class Solution {
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    if(isprime(nums[i][j])){
                        max=Math.max(max,nums[i][j]);
                    }
                }
            }
        }
        return max;
    }
    public static boolean isprime(int n){
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}