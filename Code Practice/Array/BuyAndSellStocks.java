public class BuyAndSellStocks {
     /*
        7 | █
        6 | █           █
        5 | █     █     █
        4 | █     █     █  █   
        3 | █     █  █  █  █  
        2 | █     █  █  █  █  
        1 | █  █  █  █  █  █  
        0 +------------------
            7  1  5  3  6  4
        Prices: 
        Buy at 1, sell at 6 → Max Profit = 5
*/

    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int maxProfit = buyAndSellStocks(prices);
        System.out.println(maxProfit);
    }
}
