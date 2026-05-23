public class BuyAndSellPricejava {
    public static void MaxProfit(int Prices[]) {
        int Maxprofit=0;
        // i=buy      j=sell
        /*for(int i=0;i<Prices.length;i++){
            for(int j=i+1;j<Prices.length;j++){
                if(Prices[i]<Prices[j]){
                    Maxprofit=Math.max(Maxprofit, Prices[j]-Prices[i]);
                }
            }
        }*/
        int BuyingPrice=Integer.MAX_VALUE;
        for(int i=0;i<Prices.length;i++){
            if(BuyingPrice<Prices[i]){
                int profit=Prices[i]-BuyingPrice;
                Maxprofit=Math.max(Maxprofit, profit);
            }else{
                BuyingPrice=Prices[i]; 
            }
        }
        System.out.println(Maxprofit);
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        MaxProfit(prices);
    }
}
