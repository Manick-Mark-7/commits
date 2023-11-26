package leetcode.binarySearch;

public class _Aug_29 {
    public static void main(String[] args) {
        String str = "YYNY";
        System.out.println( bestClosingTime(str));
    }

    private static int bestClosingTime(String str) {
        int max_score = 0, score = 0, best_hour = -1;
        for(int i = 0; i < str.length(); ++i) {
            score += (str.charAt(i) == 'Y') ? 1 : -1;
            if(score > max_score) {
                max_score = score;
                best_hour = i;
            }
        }
        return best_hour + 1;
    }
}
