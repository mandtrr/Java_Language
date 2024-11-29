import java.util.Scanner;

public class Aula4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");;
        int num = scan.nextInt();

        byte nbyte = (byte) num;
        float nfloat = (float) num;

        System.out.println("Número em byte: " +nbyte);
        System.out.println("Número em float: " + nfloat);
    }

}
