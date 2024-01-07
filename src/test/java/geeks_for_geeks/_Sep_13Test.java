package geeks_for_geeks;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _Sep_13Test {



    @Test
    void findLargest_When_N_Zero(){
        int N = 0;
        int S = 10;
        String ans = _Sep_13.findLargest(N,S);
        assertEquals("-1",ans);
    }

    @Test
    void findLargest_When_S_Zero(){
        int N = 10;
        int S = 0;
        String ans = _Sep_13.findLargest(N,S);
        assertEquals("-1",ans);
    }
    @Test
    void findLargest_test(){
        int N = 2;
        int S = 9;
        String ans = _Sep_13.findLargest(N,S);
        assertEquals("90",ans);
    }

}