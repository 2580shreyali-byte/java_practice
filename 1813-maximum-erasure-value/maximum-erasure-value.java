class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left=0,maxscore=0,sum=0;
        HashSet <Integer> set=new HashSet<>();
        for(int right=0;right<nums.length;right++){
            int rele=nums[right];
            while(set.contains(rele)){
                int lele=nums[left];
                set.remove(lele);
                sum-=lele;
                left++;
            }
            set.add(rele);
            sum+=rele;
            maxscore=Math.max(maxscore,sum);
        }
        return maxscore;
    }
}