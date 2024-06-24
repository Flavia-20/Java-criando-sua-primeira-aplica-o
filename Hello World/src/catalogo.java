//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class catalogo {
    public static void main(String[] args) {
        System.out.println("Este é o Screen Mach");
        System.out.println("Filme: Top Gun: Maverick");


        /*Variável sempre inicia com letra minúscula e class com letra maiúscula*/
        int ano = 2022;
        boolean incluidoNoPlano = true;
        double nota = 8.1;
        System.out.println("Ano de lançamento: " + ano + " nota: " + nota + " incluido no plano? " + incluidoNoPlano);

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = "Filme de aventura";
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media / 2);//Casting é um recurso utilizado em Java para converter um tipo de dado em outro. Essa conversão pode ser feita de forma automática pelo compilador (conversão implícita), quando o tipo de dado de destino é compatível com o tipo de dado de origem, ou de forma manual (conversão explícita), utilizando o operador de castin
        System.out.println(classificacao);

    }
}