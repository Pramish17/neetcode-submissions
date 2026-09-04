class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       int n = position.length;
        if (n == 0) return 0;

        // Pair of position and time to reach the target
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i]) / speed[i];
        }

        // Sort the cars based on their starting position in descending order
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            double time = cars[i][1];
            // If the stack is empty or the current car takes more time than the top of the stack,
            // it means a new fleet is formed.
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }

        return stack.size();
    }
}
