package domain;

import java.util.OptionalInt;

public enum RomanNumber {
    THOUSAND("M", 1000,OptionalInt.empty()),
    NINE_HUNDRED("CM", 900,OptionalInt.of(-200)),
    FIVE_HUNDRED("D", 500, OptionalInt.empty()),
    FOUR_HUNDRED("CD", 400, OptionalInt.of(-200)),
    HUNDRED("C", 100, OptionalInt.empty()),
    NINETY("XC", 90, OptionalInt.of(-20)),
    FIFTY("L", 50, OptionalInt.empty()),
    FORTY("XL", 40, OptionalInt.of(-20)),
    TEN("X", 10, OptionalInt.empty()),
    NINE("IX", 9, OptionalInt.of(-2)),
    FIVE("V", 5, OptionalInt.empty()),
    FOUR("IV", 4, OptionalInt.of(-2)),
    ONE("I", 1, OptionalInt.empty());

    private final int arabicNumber;
    private final OptionalInt negativeSum;
    private String romanNumber;

    RomanNumber(String romanNumber, int arabicNumber, OptionalInt negativeSum) {
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
        return negativeSum.orElse(arabicNumber);
    }
}
