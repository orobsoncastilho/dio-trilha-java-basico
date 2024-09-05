public class Usuario {
    private int numeroConta;
    private int agencia;
    private String nomeCliente;
    private double saldo;

    // Construtor
    public Usuario(int numeroConta, int agencia, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos para depositar e sacar
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + String.format("%.2f", valor) + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + String.format("%.2f", valor) + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
            return false;
        }
    }

    // Exibir informações da conta
    public void infoCliente() {
        System.out.println("----------------------------------");
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Número da agência: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo inicial: R$" + String.format("%.2f", saldo));
        System.out.println("----------------------------------");
    }
}
