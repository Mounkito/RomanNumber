package domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RomanNumberTest {

    @Test
    public void should_return_one_in_roman() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toRomanNumber(1)).isEqualTo("I");
    }

    @Test
    public void should_return_two_in_roman() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toRomanNumber(2)).isEqualTo("II");
    }

    @Test
    public void should_return_three_in_roman() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toRomanNumber(3)).isEqualTo("III");
    }

    @Test
    public void should_return_four_in_roman() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toRomanNumber(4)).isEqualTo("IV");
    }
}
