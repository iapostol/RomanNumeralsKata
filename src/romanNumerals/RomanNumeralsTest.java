package romanNumerals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {
    @Test
    public void convert_1() {
        assertEquals("I", romanFor(1));
    }

    @Test
    public void convert_2() {
        assertEquals("II", romanFor(2));
    }

    @Test
    public void convert_3(){
        assertEquals("III", romanFor(3));
    }

    @Test
    public void convert_5(){
        assertEquals("V", romanFor(5));
    }

    @Test
    public void convert_6(){
        assertEquals("VI", romanFor(6));
    }

    @Test
    public void convert_7(){
        assertEquals("VII", romanFor(7));
    }

    @Test
    public void convert_10(){
        assertEquals("X", romanFor(10));
    }

    @Test
    public void convert_12(){
        assertEquals("XII", romanFor(12));
    }

    private String romanFor(int arabic) {
        String roman="";

        if (arabic >= 10) {
            roman += "X";
            arabic-=10;
        }

        if (arabic >= 5) {
            roman += "V";
            arabic-=5;
        }

        for(int i = 0; i<arabic; i++)
            roman+="I";

        return roman;
    }
}
