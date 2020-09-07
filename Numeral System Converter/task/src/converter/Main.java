package converter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String str = Number.decimalToOctalString(number);
        System.out.println(str.charAt(str.length()-1));
    }

}
