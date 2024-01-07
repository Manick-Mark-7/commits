package geeks_for_geeks;

import java.util.HashMap;
import java.util.Map;

public class Repetition_Of_Its_Substring_Of_Length_k_Dec_29 {
    int kSubstrConcat(int n, String s, int k)
    {
        if(n%k != 0) return 0;
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i+k<=n; i+=k){
            String chunk = s.substring(i, i+k);
            map.put(chunk, map.getOrDefault(chunk, 0)+1);
        }
        int count = 0;
        for(String key : map.keySet()) {
            if(map.get(key) > 1) count++;
        }
        if(map.size() > 2) return 0;
        return count >= 2 ? 0 : 1;

    }
}
