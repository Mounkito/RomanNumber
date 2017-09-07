package domain;

public enum RomanNumber {
    ONE("I" , 1),
    FIVE("V" , 5),
    TEN("X" , 10),
    FIFTY("L" , 50),
    HUNDRED("C" , 100),
    FIVE_HUNDRED("D" , 500),
    THOUSAND("M" , 1000);

    private final String Romannumber;
    private final int arabicNumber;

    RomanNumber(String RomanNumber, int arabicNumber) {
        this.Romannumber = RomanNumber;
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
}
