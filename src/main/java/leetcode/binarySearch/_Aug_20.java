package leetcode.binarySearch;

public class _Aug_20 {
    public static void main(String[] args) {
        String str = "aba";
        System.out.println(repeatedSubstringPattern(str));
    }

    private static boolean repeatedSubstringPattern(String str) {
        String extended = str+str;
        String subString = extended.substring(1,extended.length()-1);
        return subString.contains(str);
    }
}
