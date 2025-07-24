class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for(int num: prices){
            if(buy > num) buy = num;
            else profit = Math.max(num - buy, profit);
        } 

        return profit;   
    }
}