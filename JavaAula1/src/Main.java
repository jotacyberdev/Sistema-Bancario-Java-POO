public class Main {

    public static void main(String[] args) {

        Cliente joao = new Cliente("João");
        Cliente maria = new Cliente("Maria");
        Cliente pedro = new Cliente("Pedro");

        ContaBancaria cj = new ContaEspecial(joao, 500.00, 300.00);
        ContaBancaria cm = new ContaComum(maria, 400.00);
        ContaBancaria cp = new ContaComum(pedro, 100.00);

        Banco banco = new Banco();

        banco.sacar(cj, 650.00);             // 1
        banco.sacar(cm, 450.00);             // 2
        banco.transferir(cm, cp, 150.00);    // 3
        banco.depositar(cp, 50.00);          // 4
        banco.transferir(cj, cm, 100.00);    // 5
        banco.sacar(cj, 80.00);              // 6
        banco.transferir(cp, cj, 200.00);    // 7
        banco.sacar(cp, 10.00);              // 8

        System.out.printf("João: R$ %.2f%n", cj.getSaldo());
        System.out.printf("Maria: R$ %.2f%n", cm.getSaldo());
        System.out.printf("Pedro: R$ %.2f%n", cp.getSaldo());


    }

}
