package NeetCode;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }

    private static boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] == arr[i])
                return false;
        }
        return true;
    }
}
