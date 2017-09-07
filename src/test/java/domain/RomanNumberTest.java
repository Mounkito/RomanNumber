package domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RomanNumberTest {

    @Test
    public void should_return_the_closest_roman_number_I() throws Exception {
        Assertions.assertThat(RomanNumber.romanNumberclosest(2)).isEqualTo(RomanNumber.ONE);
    }

    @Test
    public void should_return_the_closest_roman_number_V() throws Exception {
        Assertions.assertThat(RomanNumber.romanNumberclosest(3)).isEqualTo(RomanNumber.ONE);
    }

    @Test
    public void should_return_the_closest_roman_number_X() throws Exception {
        Assertions.assertThat(RomanNumber.romanNumberclosest(12)).isEqualTo(RomanNumber.TEN);
    }

    @Test
    public void should_return_the_closest_roman_number_L() throws Exception {
        Assertions.assertThat(RomanNumber.romanNumberclosest(45)).isEqualTo(RomanNumber.FIFTY);
    }




}
