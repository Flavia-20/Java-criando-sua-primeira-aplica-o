
import java.util.Scanner;

public class tabuada{
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitura.nextInt();

        System.out.println("Tabuada do" + numero + "é: ");
        for (int i = 1; i < 11; i++) {
            System.out.println(numero + "x" + i + "=" + (numero *i));
        }
    }

}



