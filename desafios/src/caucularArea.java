import java.util.Scanner;

public class caucularArea {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("------MENÚ------");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.println("Escolha uma opção:");
        int numero = leitura.nextInt();

        if(numero == 1) {
            System.out.println("Digite o valor da lateral do quadrado: ");
            double lado = leitura.nextDouble();
            double areaQuadrado = lado *lado;
            System.out.println("A área do quadrado é: "+ areaQuadrado);
        } else {
            System.out.println("Digite o valor da raio do circulo: ");
            double raio = leitura.nextDouble();
            double areaCirclo = 3.14 * (raio * raio);
            System.out.println("A área do circulo é: "+ areaCirclo);
        }
    }
}
