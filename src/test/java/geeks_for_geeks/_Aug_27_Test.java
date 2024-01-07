package geeks_for_geeks;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _Aug_27_Test {


    @Test
    public void When_String_Is_Not_Null(){
        String str = "Manick";
        assertEquals("kcinaM",_Aug_27.reverseWord(str));
    }

    @Test
    public void When_String_Is_Empty(){
        String str ="";
        assertEquals("",_Aug_27.reverseWord(str));
    }


}