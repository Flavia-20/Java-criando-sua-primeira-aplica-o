import java.util.Scanner;


public class comparacao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int numero1 = leitura.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int numero2 = leitura.nextInt();

        if (numero1 == numero2) {
            System.out.println("O numeros digitados são iguais");
        } else if (numero1 != numero2 && numero1 > numero2) {
            System.out.println("Os numeros digitados são diferentes e o primeiro número é maior que o segundo");
        } else if (numero1 != numero2 && numero1 < numero2){
            System.out.println("Os numeros digitados são diferentes e o segundo número é maior que o primeiro");
        }
    }
}

