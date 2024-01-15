package src.main.java.geeks_for_geeks;

public class Grinding_Geeks_Jan_15 {
    public static void main(String[] args) {
        int n = 11;
        int total = 10;
        int[] cost = {10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int ans = max_courses(n,total,cost);
    }

    public static int max_courses(int n, int total, int[] cost) {

        int dp[][] = new int[n+1][total + 1];

        for(int i = n-1 ; i >= 0 ; i--){

            for(int tot = 0 ; tot <= total ; tot++){

                int notake = dp[i+1][tot];
                int take = 0;
                if(tot >= cost[i]){
                    take = 1 + dp[i + 1][tot - cost[i] + (int) Math.floor(cost[i] * 0.9) ];
                }
                dp[i][tot] = Math.max(take , notake);
            }

        }
        return dp[0][total];
    }
}
