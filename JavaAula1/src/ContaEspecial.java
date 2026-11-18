public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial(Cliente titular, double saldoInicial, double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {

        if (valor > 0 && valor <= (getSaldo() + limite)) {

            atualizarSaldo(getSaldo() - valor);
            return true;

        }

        return false;
    }

}
