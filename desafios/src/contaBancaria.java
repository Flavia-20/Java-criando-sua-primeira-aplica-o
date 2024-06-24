import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {

        String nome = "Tonny Stark";
        String tipoDeConta = "Corrente";
        double saldoAtual = 3220000.50;


        System.out.println("************************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Saldo atual: " + saldoAtual);
        System.out.println("\n************************************");

        Scanner leitura = new Scanner(System.in);


        int operacao = 0;
        while (operacao != 4) {

            System.out.println("\nOperações");
            System.out.println("1. Consultar saldos");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            System.out.println("Digite a operação desejada");
            operacao = leitura.nextInt();

            if (operacao == 1) {
                System.out.println("\nSou saldo atual é de: " + saldoAtual);
            } else if (operacao == 2) {
                System.out.println("\nQual a quantia você irá receber?");
                double receber = leitura.nextDouble();
                double soma = receber + saldoAtual;
                System.out.println("\nSeu saldo agora é de: " + soma);
            } else if (operacao == 3) {
                System.out.println("\nQual a quantia você irá enviar?");
                double enviar = leitura.nextDouble();
                    if (enviar > saldoAtual){
                        System.out.println("Não ha saldo suficiente para a trasnferência");
                    }else {
                        double subtracao = saldoAtual - enviar;
                        System.out.println("\nSeu saldo agora é de: " + subtracao);

                    }

            }
        }

    }

}
