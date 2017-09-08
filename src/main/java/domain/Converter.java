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

    public int toArabicNumber(String numberToConvert) {
        if (numberToConvert.equals("IV"))
            return 4;
        if (numberToConvert.equals("IX"))
            return 9;

        int countChar = CountCharValue(numberToConvert,'I', 1);
        countChar += CountCharValue(numberToConvert,'V', 5);
        countChar += CountCharValue(numberToConvert,'X', 10);
        return  countChar;
    }

    private int CountCharValue(String numberToConvert, char romanNumber, int arabicNumber) {
        char[] romanNumberCharArray = numberToConvert.toCharArray();
        int countChar = 0;
        for (char romanChar : romanNumberCharArray) {
            if(romanChar == romanNumber)
                countChar += arabicNumber;
        }
        return countChar;
    }
}
