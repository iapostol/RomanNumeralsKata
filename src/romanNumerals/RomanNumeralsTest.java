package romanNumerals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {
    @Test
    public void convert_arabic_to_roman() {
        assertEquals("I", romanFor(1));
        assertEquals("II", romanFor(2));
        assertEquals("III", romanFor(3));
        assertEquals("V", romanFor(5));
        assertEquals("VI", romanFor(6));
        assertEquals("VII", romanFor(7));
        assertEquals("X", romanFor(10));
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
