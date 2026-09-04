class Solution {
    public int maxArea(int[] heights) {
         int maxArea = 0;
        int pointerA = 0;
        int pointerB = heights.length-1;

        while(pointerA<pointerB){
            if(heights[pointerA] < heights[pointerB]){
                maxArea = Math.max(maxArea, heights[pointerA]*(pointerB-pointerA));
                pointerA++;
            }else {
                maxArea = Math.max(maxArea, heights[pointerB]*(pointerB-pointerA));
                pointerB--;
            }
        }
        return maxArea; /* Time Complexity O(n) */
    }
}
