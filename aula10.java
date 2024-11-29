import java.util.Scanner;

public class aula10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual é a sua altura? ");
        double altura = scan.nextDouble();
        System.out.println("Qual é o seu peso em KG? ");
        double peso = scan.nextDouble();
        double imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso");
        }
        else if (imc >= 18.5 && imc < 25) {
            System.out.println("Você está no peso ideal");
        }
        else if (imc >= 25 && imc < 30) {