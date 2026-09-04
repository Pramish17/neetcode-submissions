class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i :nums){
            sum += i;
        }
        if(sum%2!=0) return false;
        sum = sum/2;

        boolean[] result = new boolean[sum+1];
        result[0] = true;

        for(int i: nums){
            for(int j = sum; j>=i; j--){
                result[j] = result[j] || result[j-i];
            }
        }
        return result[sum];
    }
}