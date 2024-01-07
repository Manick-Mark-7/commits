package leetcode.binarySearch;

import java.util.HashMap;
import java.util.PriorityQueue;

public class _Aug_23 {
    public static void main(String[] args) {
        String str = "aab";
        System.out.println(reorganizeString(str));

    }

    private static String reorganizeString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b)->(map.get(b)-map.get(a)));
        pq.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(pq.size()>=2){
            char c1 = pq.poll();
            char c2 = pq.poll();

            sb.append(c1);
            sb.append(c2);
            map.put(c1,map.get(c1)-1);
            map.put(c2,map.get(c2)-1);

            if(map.get(c1) > 0) pq.add(c1);
            if(map.get(c2) > 0) pq.add(c2);
        }
        if(!pq.isEmpty()){
            char c = pq.poll();
            if(map.get(c)>1) return "";
            sb.append(c);
        }
        return sb.toString();
    }
}
