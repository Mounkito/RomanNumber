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
    @Parameters({"1,I", "2,II", "3,III", "4,IV", "5,V", "6,VI", "7,VII",
            "8,VIII", "9,IX", "10,X", "45,XLV","74,LXXIV","99,XCIX",
            "404,CDIV", "992,CMXCII", "2300, MMCCC", "3444,MMMCDXLIV"})
    public void should_return_number_in_arabic_number(int arabicNumber, String romanNumber) throws Exception {
        Converter converter = new Converter();
        Assertions.assertThat(converter.toArabicNumber(romanNumber)).isEqualTo(arabicNumber);
    }

}
