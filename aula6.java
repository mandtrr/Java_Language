import java.util.Scanner;

public class aula6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        String num = scan.nextLine();
        int converter = Integer.parseInt(num);
        System.out.println("Convertido para inteiro: " + converter);
    }
}
