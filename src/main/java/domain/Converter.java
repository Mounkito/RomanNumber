package domain;

class Converter {

    String toRomanNumber(int valueToConvert) {
        StringBuilder stringBuilder = new StringBuilder();
        int restToProcess = valueToConvert;
        for (RomanNumber romanNumber : RomanNumber.values()) {
            valueToConvert = romanNumber.getArabicNumber();
            while (restToProcess >= valueToConvert) {
                stringBuilder.append(romanNumber.getRomanNumber());
                restToProcess -= valueToConvert;
            }
        }
        return stringBuilder.toString();
    }

    int toArabicNumber(String numberToConvert) {
        int arabicResult = 0;
        for (RomanNumber romanNumber : RomanNumber.values()) {
            while (numberToConvert.startsWith(romanNumber.getRomanNumber())) {
                arabicResult += romanNumber.getArabicNumber();
                numberToConvert = numberToConvert.substring(romanNumber.getRomanNumber().length());
            }
        }
        return arabicResult;
    }
}
