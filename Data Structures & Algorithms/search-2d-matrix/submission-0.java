class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /**
        use binary search to get optimal soln,
        to find midpoint element in 2D array, midpointElement = matrix[midpoint/columns][midpoint%columns]
         */
        if(matrix.length == 0) return false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows*cols-1;

        while(left<=right){
            int midpoint = left+(right-left)/2;
            int midpointElement = matrix[midpoint/cols][midpoint%cols];
            if(midpointElement == target) return true;
            else if(target< midpointElement){
                right = midpoint-1;
            }else if(target > midpointElement){
                left = midpoint+1;
            }
        }
        return false; /**Time complexity O(log(m×n)) */
    }
}