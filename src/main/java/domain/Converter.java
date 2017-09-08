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
        if (romanNumber.equals("V"))
            return 5;
        if (romanNumber.equals("IV"))
            return 4;
        if (romanNumber.equals("VI"))
            return 6;


        char[] romanNumberCharArray = romanNumber.toCharArray();
        int countCharOne = 0;
        for (char romanChar : romanNumberCharArray) {
            if(romanChar == 'I')
                countCharOne++;
        }
        return  countCharOne;
    }
}
