package domain;

public class Converter {
    public String toRomanNumber(int number) {
        StringBuilder stringBuilder = new StringBuilder();

        if(number >= 5 && number < 9){
            stringBuilder.append("V");
            number = number - 5;
        }
        if(number == 0 ||number == 1 || number == 2 || number == 3){
            for (int i = 0; i < number; i++) {
                stringBuilder.append("I");
            }
            return stringBuilder.toString();
        }

        if(number == 4)
            return "IV";


        if(number == 9)
            return "IX";
        if(number == 10)
            return "X";

        else return "";
    }
}
