package domain;

public enum RomanNumber {
    THOUSAND("M" , 1000),
    FIVE_HUNDRED("D" , 500),
    HUNDRED("C" , 100),
    FIFTY("L" , 50),
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


    public static RomanNumber romanNumberclosest(int arabicNumber) {
        int diff = arabicNumber - ONE.arabicNumber;
        RomanNumber currentRomanNumber = ONE;

        for (RomanNumber romanNumber : RomanNumber.values()) {
            if(Math.abs(romanNumber.arabicNumber - arabicNumber) < diff){
                diff = Math.abs(romanNumber.arabicNumber - arabicNumber);
                currentRomanNumber = romanNumber;
            }
        }
        return currentRomanNumber;
    }

    public String getRomanNumber() {
        return romanNumber;
    }

    public int getArabicNumber() {
        return arabicNumber;
    }
}
