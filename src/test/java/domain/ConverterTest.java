package domain;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ConverterTest {

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

    @Test
    public void should_return_five_in_roman() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toRomanNumber(5)).isEqualTo("V");
    }

    @Test
    public void should_return_six_in_roman() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toRomanNumber(6)).isEqualTo("VI");
    }

    @Test
    public void should_return_seven_in_roman() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toRomanNumber(7)).isEqualTo("VII");
    }
}
