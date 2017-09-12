package domain;

public enum RomanNumber {
    THOUSAND("M", 1000, 0),
    NINE_HUNDRED("CM", 900, -200),
    FIVE_HUNDRED("D", 500, 0),
    FOUR_HUNDRED("CD", 400, -200),
    HUNDRED("C", 100, 0),
    NINETY("XC", 90, -20),
    FIFTY("L", 50, 0),
    FORTY("XL", 40, -20),
    TEN("X", 10, 0),
    NINE("IX", 9, -2),
    FIVE("V", 5, 0),
    FOUR("IV", 4, -2),
    ONE("I", 1, 0);

    private final int arabicNumber;
    private final int negativeSum;
    private String romanNumber;

    RomanNumber(String romanNumber, int arabicNumber, int negativeSum) {
        this.romanNumber = romanNumber;
        this.arabicNumber = arabicNumber;
        this.negativeSum = negativeSum;
    }


    public String getRomanNumber() {
        return romanNumber;
    }

    public int getArabicNumber() {
        return arabicNumber;
    }

    public int getNegativeSumIfExist() {
        return negativeSum == 0 ? arabicNumber : negativeSum;
    }
}
