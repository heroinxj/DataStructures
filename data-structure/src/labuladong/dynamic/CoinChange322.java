package labuladong.dynamic;

import java.util.Arrays;

/**
 * 零钱兑换 322
 *
 * @author Heroin X
 * @date 2020/7/6 17:01
 */
public class CoinChange322 {

    public static void main(String[] args) {
        int[] coins = new int[]{1,2,5};
        CoinChange322 coinChange322 = new CoinChange322();
        coinChange322.coinChange3(coins,11);
    }

    int coinChange1(int[] coins, int amount){
        return dp(coins,amount);
    }

    int dp(int[] coins, int amount){
        if(amount == 0) return 0;
        if(amount < 0) return -1;
        int res = Integer.MAX_VALUE;
        for(int coin :coins){
            int sub = dp(coins, amount-coin);
            if (sub == -1){
                continue;
            }
            res = Math.min(res, dp(coins,amount-coin));
        }
        return res != Integer.MAX_VALUE ? res : -1;
    }

//    int coinChange2(int[] coins, int amount){
//        int[] memo = new int[amount+1];
//        Arrays.fill(memo,amount+1);
//        memo[0] = 0;
//        if (memo[amount] != amount+1){
//            return memo[amount];
//        }
//
//
//    }

    int coinChange3(int[] coins, int amount){
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int i = 0; i < amount+1; i++){
            for (int coin : coins){
                if(i-coin < 0){
                    continue;
                }
                dp[i] = Math.min(dp[i], 1+dp[i-coin]);
            }
        }
        return (dp[amount] == amount +1) ? -1:dp[amount];
    }

    
}
