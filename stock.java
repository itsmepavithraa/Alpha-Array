public class stock {
    public static int buyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE; // +infinity
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){ //comparing buying price with today's price --> [profit]
             int profit = prices[i] - buyPrice; //profit = today's price - buying price
             maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i]; //buying price = today's price
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4}; 
        System.out.println(buyAndSellStock(prices));
    }
}
