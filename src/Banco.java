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

        System.out.println("Conta criada: " + conta.getTitular() + ", Numero da conta e: " + conta.getNumeroConta() + "\n1");
    }
}
