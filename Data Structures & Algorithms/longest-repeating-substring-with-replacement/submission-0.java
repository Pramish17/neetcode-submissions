class Solution {
    //XYYX
    // AAABABB
    public int characterReplacement(String s, int k) {
        int res = 0;
        int l = 0;
        int maxF = 0;
        HashMap<Character, Integer> countMap = new HashMap<>();
        for(int r=0; r<s.length(); r++){
            countMap.put(s.charAt(r), countMap.getOrDefault(s.charAt(r),0)+1);
            maxF = Math.max(maxF, countMap.get(s.charAt(r)));
            // current length of the window = r-l+1;
            while((r-l+1) - maxF > k){
                // If this value is greater than k, the window is invalid. 
                //Shrink the window by moving the left pointer l and decreasing the count of the 
                //character at index l
                countMap.put(s.charAt(l), countMap.get(s.charAt(l)) -1);
                l++;
            }
            res = Math.max(res, r-l+1);
        }
        return res;
    }
}
