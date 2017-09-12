package domain;

public class Converter {
    public String toRomanNumber(int valueToConvert) {
        StringBuilder stringBuilder = new StringBuilder();
        int restToProcess = valueToConvert;
        for (RomanNumber romanNumber : RomanNumber.values()) {
            restToProcess = createRomanString(stringBuilder, romanNumber.getRomanNumber(), romanNumber.getArabicNumber(), restToProcess);
        }
        return stringBuilder.toString();
    }

    private int createRomanString(StringBuilder stringBuilder, String romanNumber, int valueToConvert, int restToProcess) {
        while (restToProcess >= valueToConvert) {
            stringBuilder.append(romanNumber);
            restToProcess -= valueToConvert;
        }
        return restToProcess;
    }

    public int toArabicNumber(String numberToConvert) {
        int countValue = 0;
        for (RomanNumber romanNumber : RomanNumber.values()) {
            countValue += CountCharValue(numberToConvert,romanNumber.getRomanNumber(),romanNumber.getNegativeSumIfExist());
        }
        return countValue;
    }

    private int CountCharValue(String numberToConvert, String romanNumber, int arabicNumber) {
        int countChar = 0;
        for (int i = 0; i < numberToConvert.length(); i++) {
            //Double element case ex : IV
            if(i+2 <= numberToConvert.length() && numberToConvert.substring(i,i+2).equals(romanNumber)){
                countChar += arabicNumber;
                i++;
            }
            //One element case ex : V
            if(numberToConvert.substring(i,i+1).equals(romanNumber)){
                countChar += arabicNumber;
            }
        }
        return countChar;
    }
}
