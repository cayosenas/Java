class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

public class ContaBancaria {
    private final int numero;
    private double saldo;
    private final String titular;

    public ContaBancaria(int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
    }

    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }
        saldo += valor;
    }

    public void transferir(double valor, ContaBancaria contaDestino) throws SaldoInsuficienteException {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public String toString() {
        return String.format("Conta %d - Titular: %s - Saldo: R$%.2f", numero, titular, saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1, 1000.0, "Alice");
        ContaBancaria conta2 = new ContaBancaria(2, 500.0, "Bob");

        System.out.println(conta1);
        System.out.println(conta2);

        try {
            conta1.transferir(200.0, conta2);
            System.out.println("Transferência realizada com sucesso.");
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(conta1);
        System.out.println(conta2);
    }
}