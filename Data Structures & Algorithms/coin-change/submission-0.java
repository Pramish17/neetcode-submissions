class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] minCoins = new int[amount + 1];
        
        for (int currentAmount = 1; currentAmount <= amount; currentAmount++) {
            minCoins[currentAmount] = amount + 1;
        }
        minCoins[0] = 0;
        for (int currentAmount = 1; currentAmount <= amount; currentAmount++) {
            for (int coin : coins) {
                if (currentAmount >= coin) {
                    minCoins[currentAmount] = Math.min(minCoins[currentAmount], minCoins[currentAmount - coin] + 1);
                }
            }
        }
        return minCoins[amount] > amount ? -1 : minCoins[amount];
    }
}