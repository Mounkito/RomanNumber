package domain;

public class Converter {


    public String toRomanNumber(int valueToConvert) {
        StringBuilder stringBuilder = new StringBuilder();
        int restToProcess = valueToConvert;
        for (RomanNumber romanNumber : RomanNumber.values()) {
            int valueToConvert1 = romanNumber.getArabicNumber();
            int restToProcess1 = restToProcess;
            while (restToProcess1 >= valueToConvert1) {
                stringBuilder.append(romanNumber.getRomanNumber());
                restToProcess1 -= valueToConvert1;
            }
            restToProcess = restToProcess1;
        }
        return stringBuilder.toString();
    }

    public int toArabicNumber(String numberToConvert) {
        int countValue = 0;
        for (RomanNumber romanNumber : RomanNumber.values()) {
            int arabicResult = 0;
            while (numberToConvert.startsWith(romanNumber.getRomanNumber())){
                arabicResult += romanNumber.getArabicNumber();
                numberToConvert = numberToConvert.substring(romanNumber.getRomanNumber().length());
            }
            countValue += arabicResult;
        }
        return countValue;
    }
}
