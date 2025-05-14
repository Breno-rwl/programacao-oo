public class Conta {
    protected String cliente;
    protected double saldo;

    public Conta(String cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    public void transferir(Conta destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }
    public void aplicarJurosDiarios() {
        // A ser sobrescrito nas subclasses
    }

    public void imprimirExtrato() {
        System.out.println("Cliente: " + cliente);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }
}
