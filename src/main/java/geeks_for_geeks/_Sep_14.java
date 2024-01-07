package geeks_for_geeks;

public class _Sep_14 {
    public static void main(String[] args) {
        int N = 6;
        int[] arr = {2,3,5,6,8,10};
        int sum = 10;
        int ans = perfectSum(arr,N,sum);
        System.out.println(ans);
    }

    protected static int perfectSum(int[] arr, int n, int sum) {
        int[][] dp = new int[n+1][sum];
        int mod = 1000000007;
        for(int i=0;i<=n;i++){
            dp[i][0] = 1;
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = (dp[i-1][j]+dp[i-1][j-arr[i-1]])%mod;
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
