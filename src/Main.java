import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<ContaBancaria> contas = new ArrayList<>();


        System.out.println("Bem-vindo ao Banco, escolha algumas das opções:\n" + "1- Criar conta\n2- Depositar\n3- Sacar\n4- Verificar saldo\n0- Sair");
        Scanner in = new Scanner(System.in);
        int escolha = in.nextInt();



        switch(escolha){
            case 1:

                break;

        }
    }
}