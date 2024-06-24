import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite suas avaliações para o filme: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;// igual a escrever: mediaAvaliacao = medaiAvaliacao + nota


        }
        System.out.println("media de avaliações" + mediaAvaliacao/3);

    }
}
