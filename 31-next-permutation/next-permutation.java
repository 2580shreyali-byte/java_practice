class Solution {
    public void nextPermutation(int[] arr) {
        int p=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                p=i;
                break;
            }
        }
        if(p==-1){
            reverse(arr,0,n-1);
            return;
        }
        int q=0;
        for(int i=n-1;i>p;i--){
            if(arr[i]>arr[p]){
                q=i;
                break;
            }
        }
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        reverse(arr,p+1,n-1);
    }
    public void reverse(int arr[],int a,int b){
        for(int i=a,j=b;i<=j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}