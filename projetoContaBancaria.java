import java.util.Scanner;

public class projetoContaBancaria {
    public static void main(String[] args) {
        String nomeDoCliente = "Luke Adelan";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;
        int opcaoEscolhida = 0;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Conta Bancária - Empresa Siunix\n");
        System.out.println("Nome: " + nomeDoCliente);
        System.out.println("Tipo de Conta: " + tipoDeConta);
        System.out.println("Saldo R$ " + saldo);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        System.out.println("Operações\n");

        System.out.println("O que deseja fazer em sua conta? Segue abaixo as opções: ");
        System.out.println("1 = Consultar saldo.");
        System.out.println("2 = Receber valor.");
        System.out.println("3 = Transferir valor.");
        System.out.println("4 = Sair.");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        Scanner leituraOpcao = new Scanner(System.in);

        while (opcaoEscolhida != 4) {
            opcaoEscolhida = leituraOpcao.nextInt();        //Entrada e conversão de dados visual no console

            if (opcaoEscolhida == 1) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Seu saldo é de: " + saldo);
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

            } else if (opcaoEscolhida == 2) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Digite o valor que deseja receber: ");
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                Scanner leituraReceberValor = new Scanner(System.in);
                double recebeValor = leituraReceberValor.nextDouble();
                saldo = saldo + recebeValor; 
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Valor recebido.");
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            
            } else if (opcaoEscolhida == 3) {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Digite o valor que deseja transferir: ");
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                Scanner leituraTransferirValor = new Scanner(System.in);
                double transfereValor = leituraTransferirValor.nextDouble();
                
                if (transfereValor > saldo) {
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Você não tem esse valor em sua conta.");
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                } else {
                    saldo = saldo - transfereValor;
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Valor transferido.");
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                }
            } 

            System.out.println("O que deseja fazer agora? Segue abaixo as opções: ");
            System.out.println("1 = Consultar saldo.");
            System.out.println("2 = Receber valor.");
            System.out.println("3 = Transferir valor.");
            System.out.println("4 = Sair.");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        }
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Até mais! :)");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

    }
}
