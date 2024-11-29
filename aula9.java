import java.util.Scanner;
public class aula9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        double rc = Math.cbrt(num);
        System.out.println("O resultado da raiz cúbica é: " + rc);
    }
}
