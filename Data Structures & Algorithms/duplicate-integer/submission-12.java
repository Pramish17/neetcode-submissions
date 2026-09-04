class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        if(set.size() == nums.length) return false;
        else return true;
    }
}
