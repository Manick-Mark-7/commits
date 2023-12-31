package geeks_for_geeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Print_Pattern_Nov_26 {
    public static void main(String[] args) {
        int N = new Random().nextInt(20);
       List<Integer> ans =  pattern(N);
        System.out.println(N);
        System.out.println(ans);
    }
    public static List<Integer>  pattern(int N){
        List<Integer> ans = new ArrayList<>();
        ans.add(N);
        if(N == 0){
            return ans;
        }
        int temp = N;
        positive(temp,ans,N);
        return ans;
    }

    private  static void positive (int val, List<Integer> ans,int N){
        if(val>0){
            ans.add(val-5);
            val=val-5;
            positive(val,ans,N);
        }
        else{
            negative(val,ans,N);
        }
    }

    private static void negative(int val, List<Integer> ans,int N){

        if(val<N){
            ans.add(val+5);
            val = val+5;
            negative(val,ans,N);
        }
        return;
    }
}
