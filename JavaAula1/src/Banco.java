
public class Banco {

    public boolean sacar(ContaBancaria conta, double valor) {
        return conta.sacar(valor);
    }

    public boolean depositar(ContaBancaria conta, double valor) {
        return conta.depositar(valor);
    }

    public boolean transferir(ContaBancaria origem,
                              ContaBancaria destino,
                              double valor) {

        if (valor <= 0) {
            return false;
        }

        if (origem.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }

        return false;
    }
}
