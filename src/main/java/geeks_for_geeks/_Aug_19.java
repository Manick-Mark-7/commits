package geeks_for_geeks;

public class _Aug_19 {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3};
        int x = 2;
        int n= arr.length;
        System.out.println(count(arr,x,n));
    }

    private static int count(int[] arr, int x, int n) {

        int count =0 ;
        for(int i=0;i<n;i++){
            if(arr[i]>x)
                return count;
            if(arr[i] == x)
                count+=1;
        }
        return count;

    }

}
