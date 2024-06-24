import java.util.Scanner;
import java.util.Random;

public class jogoAdivinhacao {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);


        int tentativas;
        for (tentativas = 0; tentativas < 5; tentativas++) {
            System.out.println("Digite seu palpite (um número inteiro): ");
            int palpite = leitura.nextInt();

            if (palpite == numeroGerado) {
                System.out.println("Parabens, você acertou");
                break;
            } else if (palpite < numeroGerado) {
                System.out.println("O número que vc digitol é menor que o número correto");
            } else {
                System.out.println("O numero digitado é maior que o número correto");
            }
        }

        if (tentativas == 5) {
            System.out.println("Você esgotou suas chances, tente de novo!");
        }

    }
}
