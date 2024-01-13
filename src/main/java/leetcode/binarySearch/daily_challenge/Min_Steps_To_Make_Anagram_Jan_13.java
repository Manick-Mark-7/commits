package src.main.java.leetcode.binarySearch.daily_challenge;

public class Min_Steps_To_Make_Anagram_Jan_13 {
    public static void main(String[] args) {
        String s = "bab";
        String t = "aba";
       int ans = minSteps(s,t);
        System.out.println(ans);
    }

    private static int minSteps(String s, String t) {
        if(s.length()!=t.length()) return -1;
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        int change = 0;

        for(int i:freq){
            change = i>0 ? change+=i : change;
        }
        return change;
    }
}
