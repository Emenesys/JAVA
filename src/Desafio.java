import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {


        String nome = "Cleber Costa";
        String tipoDaConta = "Corrente";
        Double saldo = 650.67;

        System.out.println("\n*******************************");
        System.out.println("Nome do Cliente: "+ nome);
        System.out.println("Tipo da Conta: "+ tipoDaConta);
        System.out.println("Saldo: "+ saldo);
        System.out.println("\n*******************************");


        int opcao = 0;

        String menu = """
                
                ** Digite sua opção! **
                
                1 - Saldo
                2 - Transferir
                3 - Deposito
                4 - Sair
                
                ************************
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("Saldo da conta: "+ saldo);

            } else if (opcao == 2) {
                System.out.println("Qual valor gostaria de transferir?" );
                double valorTransferido = leitura.nextDouble();
                if (valorTransferido > saldo) {
                    System.out.println("Valor de saldo insuficiente!");
                } else {
                    saldo -= valorTransferido;

                    System.out.println("Novo saldo: "+ saldo);
                }

            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valorRecebido = leitura.nextDouble();
                saldo += valorRecebido;

                System.out.println("Novo saldo: "+ saldo);

            }
        }

    }
}