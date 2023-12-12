public class ContaBancaria {
    private int NumeroConta;
    private double Saldo;

    private Cliente titular;

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return titular;
    }


}
