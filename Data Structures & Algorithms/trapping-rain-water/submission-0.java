class Solution {
    public int trap(int[] height) {
        /** use two pointer approach
        find leftMax and Right Max
        compare if leftMax<RightMax then, 
        find the difference between leftMax and height[l] and l++
        same on the right and do right --
        return the max result
         */

        int n = height.length;
        int l =0;
        int r = n-1;
        int leftMax = 0;
        int rightMax = 0;
        int res = 0;

        while(l<r){
            if(height[l]>leftMax){
                leftMax = Math.max(leftMax, height[l]);
            }
            if(height[r]>rightMax){
                rightMax = Math.max(rightMax, height[r]);
            }
            if(leftMax < rightMax){
                res = res+ leftMax- height[l];
                l++;
            }
            else{
               res = res + rightMax-height[r];
               r--; 
            }
        }
        return res;
    }
}
