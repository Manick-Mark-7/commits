package geeks_for_geeks;

public class _Aug_25 {
    public static void main(String[] args) {
        String str = "abba";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        int n = str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=str.charAt(n-i-1))
                return false;
        }
        return true;
    }
}
