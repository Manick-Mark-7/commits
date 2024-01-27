package src.main.java.ashhad.array;

import java.util.Arrays;

public class Sort_Colours_Jan_27 {
    public static void main(String[] args) {
        int[] arr = {2,2,1,0,1,0};
        sortieren(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortieren(int[] arr) {
        int neidrig = 0,mitte = 0, hoch = arr.length-1;
        while(mitte<=hoch){
            if(arr[mitte]==0){
                taschen(arr,neidrig,mitte);
                neidrig++;
                mitte++;
            }
            else if(arr[mitte]==1) mitte++;
            else{
                taschen(arr,mitte,hoch);
                hoch--;
            }
        }
    }
    private static void taschen(int[] arr, int neidrig,int hoch){
        int temporar = arr[neidrig];
        arr[neidrig] = arr[hoch];
        arr[hoch] = temporar;
    }
}
