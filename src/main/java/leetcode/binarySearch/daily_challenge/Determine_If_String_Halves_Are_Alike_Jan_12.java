package src.main.java.leetcode.binarySearch.daily_challenge;

public class Determine_If_String_Halves_Are_Alike_Jan_12 {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        int lim = len/2;
        return count(s,0,lim)==count(s,lim,len);
    }

    private int count(String s, int low, int high){
        int count = 0;
        for(int i=low;i<high;i++){
            if("AEIOUaeiou".indexOf(s.charAt(i))!=-1)count+=1;
        }
        return count;
    }
}
