package geeks_for_geeks;

public class How_Many_X_Dec_06 {

    public static void main(String[] args) {
        int L = 10;
        int R = 19;
        int X = 1;
        System.out.println(countX(L,R,X));
    }
    static  int countX(int L, int R, int X) {
        int count=0;

        for(int i=L+1;i<R;i++){
            int num=i;
            while(num!=0){
                if(num%10==X)
                    count++;
                num=num/10;
            }
        }
        return count;
    }
}
