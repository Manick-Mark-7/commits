package src.main.java.geeks_for_geeks;

public class Fractional_Knapstack_Jan_26 {
    class Frac{
        int profit;
        int weig;
        double pByW;
        Frac(int profit,int weig){
            this.profit = profit;
            this.weig = weig;
            this.pByW = ((double)profit/(double)weig);
        }
    }

    class Solution
    {
        double fractionalKnapsack(int W, Item arr[], int n)
        {
            PriorityQueue<Frac> pq = new PriorityQueue<>(new Comparator<Frac>(){
                @Override
                public int compare(Frac a,Frac b){
                    if(a.pByW==b.pByW){
                        return 0;
                    }else if(a.pByW>b.pByW){
                        return -1;
                    }else{
                        return 1;
                    }
                }
            });
            for(int i=0;i<n;i++){
                pq.add(new Frac(arr[i].value,arr[i].weight));
            }

            double TotalProfit = 0;//contain ans;
            while(!pq.isEmpty()){
                Frac val = pq.poll();
                if(W==0){
                    break;
                }
                if(val.weig<=W){
                    TotalProfit += val.profit;
                    W = W-val.weig;
                }else{
                    // double a = (double) W/val.weig;
                    TotalProfit += (double) ((double)val.profit*(double)W/val.weig);
                    W = 0;
                }
            }
            return TotalProfit;

        }
    }
}
