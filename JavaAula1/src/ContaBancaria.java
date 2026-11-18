
public class ContaBancaria {

    private Cliente titular;
    private double saldo;

    public ContaBancaria(Cliente titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }

        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }

        return false;
    }
    protected void atualizarSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }
}
