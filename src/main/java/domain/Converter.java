package domain;

public class Converter {
    public String toRomanNumber(int number) {
        if(number == 1)
            return "I";
        if(number == 2)
            return "II";
        else return "";
    }
}
