package converter;

public class Number {
    public String decimalToBinary(int decimalNumber) {
        String str = "";
        if(decimalNumber == 0){
            str = "0";
        }
        else{
            while (decimalNumber > 0){
                str = decimalNumber % 2 + str;
                decimalNumber /= 2;
            }
        }
        return str;
    }
    public static String decimalToOctalString(int decimalNumber) {
        String str = "";
        if(decimalNumber >= 0 && decimalNumber <= 7){
            str += decimalNumber;
        }
        else{
            while (decimalNumber >  0) {
                str = decimalNumber % 8 + str;
                decimalNumber /= 8;
            }
        }
        return str;

    }
}
