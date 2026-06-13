/*TWO POINTER OR SLIDING WINDOW APPROACH:
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int i =0;
        int j = 1;
        int max_pro = 0;
        while (j < n){
            if(prices[i]<prices[j]){
                int curr_pro = prices[j]-prices[i];
                if(curr_pro > max_pro){
                    max_pro = curr_pro;
                }
            }
            else{
                i=j;
            }
            j++;
        }
        return max_pro;
    }
} */

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max_profit = 0;
        int n = prices.length;
        for(int i=0; i<n; i++){
            min = Math.min(min,prices[i]);
            max_profit = Math.max(max_profit,prices[i]-min);
        }
        return max_profit;
    }
}