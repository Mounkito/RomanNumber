package domain;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ConverterTest {

    @Test
    @Parameters({"1,I", "2,II", "3,III", "4,IV", "5,V", "6,VI", "7,VII",
            "8,VIII", "9,IX", "10,X", "45,XLV","74,LXXIV","99,XCIX",
            "404,CDIV", "992,CMXCII", "2300, MMCCC", "3444,MMMCDXLIV"})
    public void should_return_number_in_roman(int arabicNumber, String romanNumber) throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toRomanNumber(arabicNumber)).isEqualTo(romanNumber);
    }

    @Test
    public void should_return_one_in_arabic_number() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toArabicNumber("I")).isEqualTo(1);
    }

    @Test
    public void should_return_five_in_arabic_number() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toArabicNumber("V")).isEqualTo(5);
    }

    @Test
    public void should_return_two_in_arabic_number() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toArabicNumber("II")).isEqualTo(2);
    }

    @Test
    public void should_return_three_in_arabic_number() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toArabicNumber("III")).isEqualTo(3);
    }

    @Test
    public void should_return_four_in_arabic_number() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toArabicNumber("IV")).isEqualTo(4);
    }

    @Test
    public void should_return_six_in_arabic_number() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toArabicNumber("VI")).isEqualTo(6);
    }

    @Test
    public void should_return_seven_in_arabic_number() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toArabicNumber("VII")).isEqualTo(7);
    }

    @Test
    public void should_return_eight_in_arabic_number() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toArabicNumber("VIII")).isEqualTo(8);
    }

    @Test
    public void should_return_nine_in_arabic_number() throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toArabicNumber("IX")).isEqualTo(9);
    }

}
