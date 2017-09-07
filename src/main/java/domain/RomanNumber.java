package domain;

public enum RomanNumber {
    THOUSAND("M" , 1000),
    FIVE_HUNDRED("D" , 500),
    HUNDRED("C" , 100),
    NINETY("XC" , 90),
    FIFTY("L" , 50),
    FORTY("XL" , 40),
    TEN("X" , 10),
    NINE("IX" , 9),
    FIVE("V" , 5),
    FOUR("IV" , 4),
    ONE("I" , 1);

    private final int arabicNumber;
    private String romanNumber;

    RomanNumber(String romanNumber, int arabicNumber) {
        this.romanNumber = romanNumber;
        this.arabicNumber = arabicNumber;
    }


    public String getRomanNumber() {
        return romanNumber;
    }

    public int getArabicNumber() {
        return arabicNumber;
    }
}
