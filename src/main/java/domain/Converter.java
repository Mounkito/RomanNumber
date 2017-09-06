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

        if(number == 5 || number == 6 || number == 7){
            stringBuilder.append("V");
            for (int i = 0; i < number - 5; i++) {
                stringBuilder.append("I");
            }
            return stringBuilder.toString();
        }

        if(number == 8)
            return "VIII";

        else return "";
    }
}
