package leetcode.binarySearch.daily_challenge;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Destination_City_Dec_15 {
    public String destCity(List<List<String>> paths) {
        Set<String> cities = new HashSet<>();
        for (List<String> path : paths) {
            cities.add(path.get(0));
        }

        for (List<String> path : paths) {
            String dest = path.get(1);
            if (!cities.contains(dest)) {
                return dest;
            }
        }
        return "";
    }
}