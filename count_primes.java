class Solution {
    public int countPrimes(int n) {
        long count =0;
        for(int num=0;num<=n;num++){
            if(isPrime(num)) count++;
        }
        return (int)count;
    }
    public boolean isPrime(int n){
        if(n==0 || n==1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i<=n/2;i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}
