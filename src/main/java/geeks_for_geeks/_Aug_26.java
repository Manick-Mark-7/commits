package geeks_for_geeks;

import java.util.HashMap;
//Longest K unique Character substring

public class _Aug_26 {
    public static void main(String[] args) {
        String str = "aabacbebebe";
        int k =3;
        System.out.println(longestKSubstr(str,k));
    }

    private static int longestKSubstr(String s, int k) {

        int ans = -1;
        int i=0,j=0;

        HashMap<Character, Integer> map = new HashMap<>();

        while(j < s.length()){
            char ch = s.charAt(j);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if(map.size() == k){
                ans = Math.max(ans, j-i+1);
            }

            while(map.size() > k){
                char chi = s.charAt(i);
                map.put(chi,map.get(chi)-1);
                if(map.get(chi) == 0){
                    map.remove(chi);
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}
