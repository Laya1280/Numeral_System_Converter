package converter;


public class Main {
    public static void main(String[] args) {
        int decimalNumber = 10;
        System.out.print(decimalNumber + " is equal to 0b" + convertToBinary(decimalNumber));
    }
    public static String convertToBinary( int decimalNumber) {
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
}
