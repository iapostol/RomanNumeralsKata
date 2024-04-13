package romanNumerals;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static romanNumerals.RomanNumerals.romanFor;

public class RomanNumeralsTest {
    @Test
    public void convert_decimal_to_roman() {
        assertThat(romanFor(1), is("I"));
        assertThat(romanFor(2), is("II"));
        assertThat(romanFor(3), is("III"));
        assertThat(romanFor(4), is("IV"));
        assertThat(romanFor(5), is("V"));
        assertThat(romanFor(7), is("VII"));
        assertThat(romanFor(9), is("IX"));
        assertThat(romanFor(10), is("X"));
        assertThat(romanFor(18), is("XVIII"));
        assertThat(romanFor(30), is("XXX"));
        assertThat(romanFor(40), is("XL"));
        assertThat(romanFor(1981), is("MCMLXXXI"));
        assertThat(romanFor(2024), is("MMXXIV"));
    }
}