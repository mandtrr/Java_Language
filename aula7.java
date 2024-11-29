import java.util.Scanner;

public class aula7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva uma palavra ou frase: ");
        String palavra = scan.nextLine();
        String upper = palavra.toUpperCase();
        System.out.println("Em letra maiúscula: " + upper);
    }
}
