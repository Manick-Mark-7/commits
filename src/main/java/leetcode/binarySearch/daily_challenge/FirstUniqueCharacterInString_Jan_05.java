package src.main.java.leetcode.binarySearch.daily_challenge;

public class FirstUniqueCharacterInString_Jan_05 {
    public static void main(String[] args) {
        String str = "leetcode";
        int pos = firstUniqChar(str);
        System.out.println(pos);
    }

    private static int firstUniqChar(String s) {
        String temp = s.toLowerCase();
        int[] arr = new int[26];
        for(Character c: temp.toCharArray()){
            arr[c-'a']++;
        }
        for(int i=0;i<temp.length();i++){
            if(arr[temp.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}
