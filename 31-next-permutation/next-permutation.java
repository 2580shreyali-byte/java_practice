class Solution {
    public void nextPermutation(int[] arr) {
        int n=arr.length;
        int p=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i+1]>arr[i]){
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
    public void reverse(int arr[],int p,int q){
        for(int i=p,j=q;i<=j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}