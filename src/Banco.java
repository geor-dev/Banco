import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Conta> contas = new ArrayList<>();

    public void criarConta(Scanner in){
        System.out.println("Digite seu nome");
        String nome = in.next();
        System.out.println("Digite seu cpf");
        String cpf = in.next();

        Cliente cliente = new Cliente(nome,cpf);
        Conta conta = new Conta(cliente);
        clientes.add(cliente);
        contas.add(conta);

        System.out.println("Conta criada: " + conta.getTitular().getNome() + ", Numero da conta e: " + conta.getNumeroConta() + "\n1");
    }

    private Conta encontrarnumeroConta(int numeroConta){
        for (Conta conta : contas){
            if( conta.getNumeroConta() == numeroConta){
                return conta;
            }
        }
        return null;
    }

    public void depositar(Scanner in){
        System.out.println("Digite o numero da conta");
        int numeroConta = in.nextInt();

        Conta conta = encontrarnumeroConta(numeroConta);
        if (conta != null){
            System.out.println("Digite o valor a ser depositado");
            double valor = in.nextDouble();
            conta.depositar(valor);
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + conta.getSaldo());
        }else{
            System.out.println("Conta não encontrada");
        }
    }

    public void sacar(Scanner in){
        System.out.println("Digite o numero da conta");
        int numeroConta = in.nextInt();

        Conta conta = encontrarnumeroConta(numeroConta);
        if(conta != null){
            System.out.println("Digite o valor a ser sacado");
            double valor = in.nextDouble();

            if(conta.sacar(valor)){
                System.out.println("Saque realizado com sucesso. Novo saldo: " + conta.getSaldo());
            }else {
                System.out.println("Saldo insuficiente");
            }
        }
    }
    public void VerificarSaldo(Scanner in){
        System.out.println("Digite o numero da conta");
        int numeroConta = in.nextInt();

        Conta conta = encontrarnumeroConta(numeroConta);
        if(conta != null){
            System.out.println("Saldo Atual e: " + conta.getSaldo());
        }else{
            System.out.println("Conta não encontrada");
        }
    }



}
