package leetcode.binarySearch.daily_challenge;

public class Min_Operations_To_Make_Alternating_Binary_String_Dec_24 {
    public static void main(String[] args) {
            String s = "0100";
            int ans = minOperations(s);
            System.out.println(ans);
        }

        private static int minOperations(String s) {
            int start0 = 0;
            for(int i=0;i<s.length();i++){
                if(i%2==0){
                    if(s.charAt(i)=='1') start0+=1;
                }
                else{
                    if(s.charAt(i)=='0') start0+=1;
                }
            }
            return Math.min(start0,s.length()-start0);
        }
}
