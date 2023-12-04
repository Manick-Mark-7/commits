package leetcode.binarySearch.daily_challenge;

public class Largest_3_Same_Digit_Number_In_String_Dec_04 {
    public static void main(String[] args) {
        String num = "6777133339";
        String ans = largestGoodInteger(num);
        System.out.println(ans);
    }

    private static String largestGoodInteger(String num) {
        int result = -1;
        for(int i=0;i+2 < num.length();i++){
            if(num.charAt(i)== num.charAt(i+1) && num.charAt(i) == num.charAt(i+2))
                result = Math.max(result,num.charAt(i)-'0');
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<3;i++){
            sb.append((char)(48+result));
        }
        return result == -1 ? "":sb.toString();

    }
}
