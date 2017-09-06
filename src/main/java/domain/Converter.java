package domain;

public class Converter {
    public String toRomanNumber(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        if(number == 1 || number == 2 || number == 3){
            for (int i = 0; i < number; i++) {
                stringBuilder.append("I");
            }
            return stringBuilder.toString();
        }
        if(number == 4)
            return "IV";
        else return "";
    }
}
