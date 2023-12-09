package geeks_for_geeks;

import java.util.Random;

//Find wheather the given number is Smith number or not

public class Smith_Number_Dec_09 {
    public static void main(String[] args) {
        int n = new Random().nextInt(99)+1; //excluding zero
        int ans = smithNum(n);
        System.out.println("The given number "+n+" is "+(((ans==1)?"a":"not a")+" Smith Number"));
    }

    private static int smithNum(int n) {
        if(isPrime(n)) return 0;
        if(sum(n) == primeSum(n)) return 1;
        return 0;
    }

    private static int sum (int n){
        int sum = 0;
        while(n>1){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    private static int primeSum(int n){
        int i=2;
        int primeSum = 0;
        if(isPrime(n)) return n;
        while(n>1){
            while(n%i==0 && n>1){
                n/=i;
                if(isPrime(i)){
                    primeSum+=i;
                }
            }
            i++;
        }
        return primeSum;
    }

    private static boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
