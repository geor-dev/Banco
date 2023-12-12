import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        System.out.println("Bem-vindo ao Banco, escolha algumas das opções:\n 1-criar conta\n2-depositar\n3-sacar\n4-verificar saldo");
        Scanner in = new Scanner(System.in);
        int escolha = in.nextInt();



        switch(escolha){
            case 1:
                System.out.println("Digite seu nome");
                String nome = in.next();
                System.out.println("Digite seu cpf");
                String cpf = in.next();

                Cliente cliente = new Cliente(nome,cpf);
                ContaBancaria conta = new ContaBancaria();
                clientes.add(cliente);
                contas.add(conta);
                conta.setTitular(cliente);

        }
    }
}