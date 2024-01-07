package geeks_for_geeks;

public class Techfest_And_The_Queue_Jan_06 {
    public static void main(String[] args) {
        long a = 9;
        long b = 12;
        long ans = sumOfPowers(a,b);
        System.out.println(ans);
    }

    private static long sumOfPowers(long a, long b) {
        long ans = 0;
        for(long i=a;i<=b;i++){
            ans+=primeFactors(i);
        }
        return ans;
    }

    private static long primeFactors(long n){
        long count = 0;
        while(n%2 == 0){
            count+=1;
            n/=2;
        }

        for(long i=3;i<=Math.sqrt(n);i++){
            while(n%i==0){
                count+=1;
                n/=i;
            }
        }
        if(n>2) count+=1;
        return count;

    }
}
