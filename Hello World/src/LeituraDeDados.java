import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
//Aula 4 do modulo 3

        //para guardar dados nos outros códigos usavam variáveis, aqui para mostar os dados no terminal usa o Scanner
        Scanner leitura = new Scanner(System.in);// ler o que o usuário digitar

        System.out.println("digite seu filme favorito");
        String filme = leitura.nextLine();//guarda o que foi digitado, usou nextLine porque o dado a ser guardado é uma string
        System.out.println(filme);
        System.out.println("Qual o ano de lançamento do filme? ");
        int anoDeLancamento = leitura.nextInt();// usou nextInt porque o dado a ser guardado é um inteiro
        System.out.println(anoDeLancamento);
        System.out.println("qual sua avalaição para o filme?");
        double avaliacao = leitura.nextDouble();
        System.out.println(avaliacao);

    }
}
