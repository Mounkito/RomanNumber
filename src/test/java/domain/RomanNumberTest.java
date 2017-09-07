package domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RomanNumberTest {

    @Test
    public void should_return_the_closest_roman_number() throws Exception {
        Assertions.assertThat(RomanNumber.romanNumberclosest(2)).isEqualTo(RomanNumber.ONE);
    }
}
