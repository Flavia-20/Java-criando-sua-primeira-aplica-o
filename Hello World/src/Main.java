//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//este foi o primeiro programa
// TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello World!");
        //cometário de uma linha
        /*comentário de mais
        de uma linha
         */
        String saudacao = "Olá, ";
        String nome = "Alura";
        String message = saudacao + nome + "!";
        System.out.print(message);

        String mesg = """
                  Olá, mundo!
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;
        System.out.print(mesg);

        /* .format esse método permite formatar um texto utilizando diversos placeholders, que são representados
        pelo caractere % seguido de uma letra que indica o tipo de dado que será inserido no placeholder.
        Por exemplo, %s indica que uma String será inserida no placeholder, %d indica um valor inteiro e
        %f indica um valor decimal.*/

        String name = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));


        String meuNome = "João";
        int Aulas = 4;

        String Mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(meuNome, Aulas);

        System.out.println(Mensagem);

    }
}