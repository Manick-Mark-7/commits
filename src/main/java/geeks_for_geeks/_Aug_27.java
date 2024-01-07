package geeks_for_geeks;

import java.util.Stack;

public class _Aug_27 {
    public static void main(String[] args) {
        String str = "GitHub";
        if(str == null)
            System.out.println("String "+str+"is null. Cannot reverse it.");
        System.out.println(reverseWord(str));
    }

    public static String reverseWord(String str) {
       StringBuilder sb = new StringBuilder();
       sb.append(str);
       return sb.reverse().toString();
    }

}
