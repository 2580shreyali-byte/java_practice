class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>num=new ArrayList<>();
        int n=nums.length;
        int freq[]=new int[n+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i]==0) num.add(i);
        }
        return num;
    }
}
