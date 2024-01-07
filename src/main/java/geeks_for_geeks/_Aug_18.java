package geeks_for_geeks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _Aug_18 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] arr = {16,17,4,3,5,2};
        int len = arr.length;
        System.out.println(leaders(arr,len));
    }

    private static ArrayList<Integer> leaders(int[] arr, int len) {
        ArrayList<Integer> ans = new ArrayList<>();
        int val = arr[len-1];
        ans.add(val);
        for(int i=len-2;i>=0;i--){
            if(arr[i]<val) continue;
            else{
                val = arr[i];
                ans.add(val);
            }
        }
        Collections.sort(ans,Collections.reverseOrder());
        return ans;
    }
}
