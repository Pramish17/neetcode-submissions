class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> frequencyMap =new HashMap<>();
        for(int n: nums){
        frequencyMap.put(n,frequencyMap.getOrDefault(n,0)+1);
        }
        for (Integer key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) == 1) {
                return key;  
            }
        }
        return -1;
    }
}
