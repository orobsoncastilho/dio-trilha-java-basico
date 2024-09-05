import java.util.Scanner;
import java.util.Random;

public class CriarConta {

    public static Usuario criarNovaConta() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Gera número de conta aleatório
        int numeroConta = random.nextInt(1000);

        // Coleta o número da agência
        System.out.print("Digite o número da agência: ");
        int agencia = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        // Coleta o nome do cliente
        System.out.print("Digite o nome completo do cliente: ");
        String nomeCliente = scanner.nextLine();

        // Define saldo inicial
        double saldoInicial = 0.00;

        // Cria o objeto Usuario (conta)
        Usuario usuario = new Usuario(numeroConta, agencia, nomeCliente, saldoInicial);
        usuario.infoCliente();

        return usuario;
    }
}
