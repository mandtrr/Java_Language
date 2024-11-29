import java.util.Scanner;
public class aula8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        if(num == 0) {
            System.out.println("O número é zero");
        }
        else if (num < 0) {
            System.out.println("O número é negativo");
        }
        else {
            System.out.println("O número é positivo");
        }
    }
}

