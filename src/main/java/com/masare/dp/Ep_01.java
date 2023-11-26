package com.masare.dp;

public class Ep_01 {
    public static void main(String[] args) {
        //Fibonaci in Recursion
        int n =5 ;
        System.out.println( fibo(n));
    }

    private static int fibo(int n) {
        int[] f= new int[n+2];
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<=n;i++){
            f[i] = f[i-1]+f[i-2];
        }
        return f[n];
    }
}
