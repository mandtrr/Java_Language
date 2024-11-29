import java.util.Scanner;

public class sistemabancario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double saldo = 0.0; //porque o professor prefere usar sempre double
        int transacoes = 0;
        boolean contaAtiva = false;

        System.out.println("--------------------- Criação de conta ---------------------");
        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();

        while (true) {
            System.out.println("Digite o valor do depósito inicial: ");
            double depositoInicial = scan.nextDouble();

            if (depositoInicial >= 0) {
                saldo = depositoInicial;
                contaAtiva = true;
                transacoes++;
                System.out.println("\n========= Conta criada com sucesso! =========");
                System.out.println("Titular: " + nome);
                System.out.println("Saldo inicial: " + saldo + "€");
                System.out.println("Estado: " + (contaAtiva ? "Ativa" : "Inativa"));
                System.out.println("Transações: " + transacoes);
                break;
            }
            else {
                System.out.println("Erro: o depósito não pode ser feito com valor negativo.");
            }
        }

        while (true) {
            System.out.println("\n========= Bem-vindo ao Banco Pablo Honey =========");
            //Album Radiohead
            System.out.println("Depositar [1]");
            System.out.println("Levantar [2]");
            System.out.println("Verificar Saldo [3]");
            System.out.println("Sair [4]");
            System.out.print("Digite a opção desejada: ");
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("--- Depósito ---");
                    System.out.println("Digite o valor que deseja depositar: ");
                    double deposito = scan.nextDouble();

                    if (deposito > 0) {
                        saldo = saldo + deposito;
                        transacoes++;
                        System.out.println("\n=== Depósito realizado com sucesso! ===");
                        System.out.println("Novo saldo: " + saldo + "€");
                        System.out.println("Transações: " + transacoes);
                    }
                    else {
                        System.out.println("Erro: o depósito não pode ser feito com valor negativo.");
                    }
                    break;

                case 2:
                    System.out.println("--- Levantamento ---");
                    System.out.println("Digite o valor que deseja levantar: ");
                    double levantamento = scan.nextDouble();

                    if (levantamento > 0 && levantamento <= saldo) { // tem que levantar mais que
                        // 0 euros e o valor tem que ser menor ou igual ao saldo que já tem
                        // disponivel
                        saldo = saldo - levantamento;
                        transacoes++;
                        System.out.println("\n=== Levantamento realizado com sucesso! ===");
                        System.out.println("Novo saldo: " + saldo + "€");
                        System.out.println("Transações: " + transacoes);
                    }
                    else if (levantamento > saldo) {
                        System.out.println("Saldo insuficiente.");
                    }
                    else {
                        System.out.println("Erro: o levantamento não pode ser feito com valor " +
                                "negativo.");
                    }
                    break;

                case 3:
                    System.out.println("\n=== Resumo da Conta ===");
                    System.out.println("Titular: " + nome);
                    System.out.println("Saldo atual: " + saldo + "€");
                    System.out.println("Número de transações: " + transacoes);
                    System.out.println("Estado: " + (contaAtiva ? "Ativa" : "Inativa"));
                    break;

                case 4:
                    System.out.println("\nObrigada por usar o Banco Pablo Honey!");
                    System.out.println("What the hell am i doing here? Bye");//musica creep
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
