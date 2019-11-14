public class BestTimeStock {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int min = prices[0];
        int maxProf = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            maxProf = Math.max(maxProf, price - min);
        }
        return maxProf;
    }
}
