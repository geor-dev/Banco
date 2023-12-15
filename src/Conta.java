public class Conta {
    private static int proximoNumeroConta = 0;
    private int numeroConta;
    private double saldo;
    private Cliente titular;

    public Conta(Cliente titular){
        this.numeroConta = ++proximoNumeroConta;
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }
    public void depositar(double valor){
        saldo += valor;
    }

    public boolean sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            return true;
        }else {
            return false;
        }
    }
}
