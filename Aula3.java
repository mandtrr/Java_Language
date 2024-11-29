import java.util.Scanner;

public class Aula3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");;
        double raio = scan.nextDouble();
        double pi = 3.14159;
        double area = pi * raio * raio;
        System.out.println("A área do círculo é: " + area);
    }
}
