//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Variaveis {

    public static void main(String[] args) {

        String titulo = "Esses são os desafios da aula dois";
        System.out.println(titulo);

        double nota1 = 5;
        double nota2 = 7;
        double media = (nota1 + nota2) / 2;
        System.out.println(media);


        double num1 = 5.6666;
        int convercao = (int) num1;
        System.out.println("O número " + num1 + " arredondado é: " + convercao);


        char letra = 'a';
        String palavra = "Alura";
        System.out.println("A variavel do tipo String guardou a palavra: " + palavra + " e a variável do tipo char guradou: "+ letra);


        double precoProduto = 15.75;
        int quantidade = 7;
        double total = precoProduto* quantidade;
        System.out.println("O total a ser pago é: " + total);


        double valorEmDolares = 50.70;
        double conver = valorEmDolares * 4.94;
        System.out.println("O valor de " + valorEmDolares + "em reais é de: " + conver);


        double precoOriginal = 150.0;

        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);

    }

}
