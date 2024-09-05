import java.util.Scanner;

public class OperacoesConta {

    public static void realizarOperacao(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha a operação: ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver Saldo");
            System.out.println("4 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Depósito
                    System.out.print("Digite o valor a ser depositado: R$");
                    double valorDeposito = scanner.nextDouble();
                    usuario.depositar(valorDeposito);
                    break;
                case 2:
                    // Saque
                    System.out.print("Digite o valor a ser sacado: R$");
                    double valorSaque = scanner.nextDouble();
                    if (!usuario.sacar(valorSaque)) {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    // Ver Saldo
                    System.out.println("Saldo atual: R$" + String.format("%.2f", usuario.getSaldo()));
                    break;
                case 4:
                    // Sair
                    continuar = false;
                    System.out.println("Operações encerradas.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
