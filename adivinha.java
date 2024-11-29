import java.util.Random;
import java.util.Scanner;

public class adivinha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=== Jogo de adivinha Acabou Chorare ==="); //album Novos Baianos
        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();

        int limiteInferior = 1;
        int limiteSuperior; //tive que declarar antes porque se não elas não funcionam
        int tentativasMaximas;
        String nivel = "";

        //um loop para que o usuario digite sempre a opção correta, qualquer número sem ser de 1
        // a 3 não vai funcionar
        while (true) {
            System.out.println("Escolha a dificuldade:");
            System.out.println("Fácil (1-50) [1]");
            System.out.println("Médio (1-100) [2]");
            System.out.println("Difícil (1-200) [3]");
            System.out.println("Opção: ");
            int dificuldade = scan.nextInt();

            if (dificuldade == 1) {
                limiteSuperior = 50;
                tentativasMaximas = 6;
                nivel = "Fácil (1-50)";
                break;
            }
            else if (dificuldade == 2) {
                limiteSuperior = 100;
                tentativasMaximas = 10;
                nivel = "Médio (1-100)";
                break;
            }
            else if (dificuldade == 3) {
                limiteSuperior = 200;
                tentativasMaximas = 15;
                nivel = "Difícil(1-200)";
                break;
            }
            else {
                System.out.println("Opção inválida! Só existem 3 níveis de dificuldade, tente " +
                        "novamente!");
            }
        }

        int numeroSorteado = random.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior; //diferença
        // entre o limite superior e inferior do nivel escolhido
        int tentativasUsadas = 0;
        boolean acertou = false; //já começa como false pq ele ainda vai jogar, então significa
        // obviamente que ele não acertou

        System.out.println("Bem-vindo(a) " + nome + "!");
        System.out.println("Vamos começar!");
        System.out.println("Dificuldade: " + nivel);
        System.out.println("Tentativas máximas: " + tentativasMaximas);

        while (tentativasUsadas < tentativasMaximas && !acertou) {
            System.out.println("Tentativa #" + (tentativasUsadas + 1) + ": ");
            int chute = scan.nextInt();
            tentativasUsadas++;

            if (chute < numeroSorteado) {
                System.out.println("Muito baixo!");
            }
            else if (chute > numeroSorteado) {
                System.out.println("Muito alto!");
            }
            else {
                acertou = true;
                System.out.println("Parabéns, " + nome + "! Conseguiu acertar em " + tentativasUsadas +
                        " tentativas!");
            }
        }

        if (tentativasUsadas == tentativasMaximas) {
            System.out.println("Não foi dessa vez! O número correto era: " + numeroSorteado);
        }

        System.out.println("\n=== Estatísticas do Jogo ===");
        System.out.println("Jogador(a): " + nome);
        System.out.println("Número sorteado: " + numeroSorteado);
        System.out.println("Tentativas usadas: " + tentativasUsadas + "/" + tentativasMaximas);
        if (acertou) {
            System.out.println("Resultado: VITÓRIA!!!!");
        }
        else {
            System.out.println("Resultado: DERROTA!!!!");
        }
        System.out.println("Fim do jogo! Obrigada");
        System.out.println("Passado, presente, participo sendo o mistério do planeta."); //musica
        // mistério do planeta
    }
}

