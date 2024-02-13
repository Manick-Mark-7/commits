package src.main.java.leetcode.binarySearch.daily_challenge;

public class Find_First_Palindromic_String_In_The_Array_Feb_13 {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        String ans = firstPalindrome(words);
        System.out.println(ans);
    }

    private static String firstPalindrome(String[] words) {
        for(String s : words){
            if(isPalindrome(s)) return s;
        }
        return "";
    }
    private static boolean isPalindrome(String s){
        int len = s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)!=s.charAt(len-i-1))return false;
        }
        return true;
    }
}
