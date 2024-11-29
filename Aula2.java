import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a temperatura em Celsius: ");;
        String celsius = scan.nextLine();
        double celsius1 = Double.parseDouble(celsius);
        double fah = (celsius1 * 9/5) + 32;
        double kelvin = celsius1 + 273.15;
        System.out.println("A temperatura digitada em Fahrenheit é de " +String.format("%.2f", fah) + " graus, e em kelvin é de " +String.format("%.2f", kelvin) + " graus");
    }

}