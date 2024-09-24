class Solution {
    public int maxProfit(int[] prices) {
        
        int outPut=0;
        int len = prices.length;
        int buy= prices[0];

        for (int i=1;i<len;i++){

        if(buy<prices[i]){
            outPut=Math.max(outPut,prices[i]-buy);
        } else {
            buy=prices[i];
        }


        }

        return outPut;
}
}