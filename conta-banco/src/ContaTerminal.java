import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Deseja criar uma conta? (sim/não): ");
        String resposta = scanner.nextLine();

        if(resposta.equalsIgnoreCase("sim")){
            Usuario usuario = CriarConta.criarNovaConta();
            // Realizar operações na conta
            OperacoesConta.realizarOperacao(usuario);
        } else {
            System.out.println("Operação cancelada.");
        }

        scanner.close();
    }
}
