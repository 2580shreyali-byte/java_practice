class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> targetIndices = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)
            targetIndices.add(i);
        }
        return targetIndices;
    }
}