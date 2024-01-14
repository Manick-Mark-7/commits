package src.main.java.geeks_for_geeks;

import java.util.Arrays;

public class Determine_If_Two_Strings_Close_Jan_14 {
    public boolean closeStrings(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(Character c :word1.toCharArray()) freq1[c-'a']++;
        for(Character c :word2.toCharArray()) freq2[c-'a']++;

        for(int i=0;i<26;i++){
            if((freq1[i]==0 && freq2[i]!=0) || (freq1[i]!=0 && freq2[i]==0)) return false;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }
}
