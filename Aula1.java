import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scan.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double num3 = scan.nextDouble();
        double media = (num1 + num2 + num3) / 3.0;
        System.out.println("A média dos 3 números digitados é de: " + media);
    }
}
