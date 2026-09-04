class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
         HashSet set = new HashSet<>();
        for(int i=0; i<n ; i++){
            set.add(nums[i]);
        }
        if(set.size()==n){
            return false;
        }else{
            return true;
        }
    }
}
