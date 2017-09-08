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
        if (romanNumber.equals("IV"))
            return 4;
        if (romanNumber.equals("IX"))
            return 9;

        char[] romanNumberCharArray = romanNumber.toCharArray();
        int countChar = 0;
        for (char romanChar : romanNumberCharArray) {
            if(romanChar == 'I')
                countChar++;
            if(romanChar == 'V')
                countChar += 5;
        }
        return  countChar;
    }
}
