package src.main.java.leetcode.binarySearch.daily_challenge;

import java.util.ArrayList;

public class KMP_Algo_Jan_09 {
    public static void main(String[] args) {
        String pat = "geek";
        String txt = "geeksforgeeks";
        ArrayList<Integer> ans = search(pat,txt);
        System.out.println(ans);
    }

    private static ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= txt.length() - pat.length(); i++) {
            int k = 0;
            while (k < pat.length() && pat.charAt(k) == txt.charAt(i + k)) {
                k++;
            }
            if (k == pat.length()) {
                list.add(i+1);
            }
        }
        return list;

    }
}
