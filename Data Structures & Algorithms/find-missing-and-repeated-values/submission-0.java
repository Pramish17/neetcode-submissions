class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
     int n = grid.length;

        int repeated = 0;

        int missing = 0;

        HashSet<Integer> set = new HashSet<>();

        // Find repeated number

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                int num = grid[i][j];

                if (!set.add(num)) {

                    repeated = num;

                }

            }

        }

        // Find missing number

        for (int num = 1; num <= n * n; num++) {

            if (!set.contains(num)) {

                missing = num;

                break;

            }

        }

        return new int[]{repeated, missing};

    }
}