import java.util.Scanner;


public class numPositivoNegativo {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int resposta = leitura.nextInt();

        if (resposta > 0) {
            System.out.println("O numero digitado é par");
        } else{
            System.out.println("O número digitado é impar");
        }


    }
}
