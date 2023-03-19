package java.leetcode;

public class buysellstock {
    public int maxProfit(int[] prices) {
        int j=Integer.MAX_VALUE,max=0,diff=0;
        for(int i=0;i<prices.length;i++)
        {
            j=j>prices[i] ? prices[i]:j;
            diff=prices[i]-j;
            max=max<diff ? diff:max;
        }
        return max;
    }
}
