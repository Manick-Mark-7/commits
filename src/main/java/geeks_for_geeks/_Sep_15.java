package geeks_for_geeks;

public class _Sep_15 {

    public static void main(String[] args) {
        int N =4;
        int[] arr = {1,5,11,5};
        int ans = equalPartition(N,arr);
        System.out.println(ans == 1?"YES":"NO");
    }

    static int equalPartition(int N, int arr[])
    {
        int total = 0;
        for(int i=0;i<N;i++){
            total+=arr[i];
        }
        if(total%2==1) return 0;
        int k = total/2;
        boolean ans = sumSubArray(arr,N,k);
        if(ans) return 1;
        return 0;
    }

    public static boolean sumSubArray(int arr[],int n,int k){
        boolean dp[][] = new boolean[n+1][k+1];
        for(int i=0;i<n+1;i++){
            dp[i][0] = true;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<k+1;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][k];
    }
}
