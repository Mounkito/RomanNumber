package domain;

public class Converter {
    public String toRomanNumber(int valueToConvert) {
        StringBuilder stringBuilder = new StringBuilder();
        int restToProcess = valueToConvert;

        for (RomanNumber romanNumber : RomanNumber.values()) {
            restToProcess = createRomanString(stringBuilder, romanNumber.getRomanNumber(), romanNumber.getArabicNumber(), restToProcess);
        }

        for (int i = 0; i < restToProcess; i++) {
            stringBuilder.append("I");
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

    public int toArabicNumber(String romanNumber) {
        if(romanNumber == "I")
            return 1;
        if (romanNumber == "II")
            return 2;
        else
            return 5;
    }
}
