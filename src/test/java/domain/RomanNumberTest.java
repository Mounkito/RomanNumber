package domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RomanNumberTest {

    @Test
    public void should_return_the_closest_roman_number_I_with_two() throws Exception {
        Assertions.assertThat(RomanNumber.romanNumberclosest(2)).isEqualTo(RomanNumber.ONE);
    }

    @Test
    public void should_return_the_closest_roman_number_I_with_three() throws Exception {
        Assertions.assertThat(RomanNumber.romanNumberclosest(3)).isEqualTo(RomanNumber.ONE);
    }


    @Test
    public void should_return_the_closest_roman_number_V_with_four() throws Exception {
        Assertions.assertThat(RomanNumber.romanNumberclosest(4)).isEqualTo(RomanNumber.FIVE);
    }


    @Test
    public void should_return_the_closest_roman_number_X_with_twelve() throws Exception {
        Assertions.assertThat(RomanNumber.romanNumberclosest(12)).isEqualTo(RomanNumber.TEN);
    }

    @Test
    public void should_return_the_closest_roman_number_L_with_fourty_five() throws Exception {
        Assertions.assertThat(RomanNumber.romanNumberclosest(45)).isEqualTo(RomanNumber.FIFTY);
    }




}
