package domain;

public class Converter {
    public String toRomanNumber(int valueToConvert) {
        StringBuilder stringBuilder = new StringBuilder();
        int restToProcess = valueToConvert;

        restToProcess = createRomanString(stringBuilder, "X", 10, restToProcess);
        restToProcess = createRomanString(stringBuilder, "IX", 9, restToProcess);
        restToProcess = createRomanString(stringBuilder, "V", 5, restToProcess);
        restToProcess = createRomanString(stringBuilder, "IV", 4, restToProcess);


        for (int i = 0; i < restToProcess; i++) {
            stringBuilder.append("I");
        }
        return stringBuilder.toString();

    }

    private int createRomanString(StringBuilder stringBuilder, String romanNumber, int valueToConvert, int restToProcess) {
        if (restToProcess >= valueToConvert) {
            stringBuilder.append(romanNumber);
            restToProcess -= valueToConvert;
        }
        return restToProcess;

    }
}
