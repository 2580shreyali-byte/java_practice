class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set= new HashSet<>();
        for(int ele:nums1){
            set.add(ele);
        }
        HashSet <Integer> ans = new HashSet<>();
        for(int ele:nums2){
            if(set.contains(ele)){
                ans.add(ele);
            }
        }
        int res[]=new int[ans.size()];
        int i=0;
        for(int ele:ans){
            res[i]=ele;
            i++;
        }
        return res;
    }
}