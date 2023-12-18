import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Banco banco = new Banco();


        Scanner in = new Scanner(System.in);


        while(true){
            System.out.println("Bem-vindo ao Banco, escolha algumas das opções:\n" + "1- Criar conta\n2- Depositar\n3- Sacar\n4- Verificar saldo\n0- Sair");
            int escolha = in.nextInt();

            switch (escolha){
                case 1:
                    banco.criarConta(in);
                    break;
                case 2:
                    banco.depositar(in);
                    break;
                case 3:
                    banco.sacar(in);
                    break;
                case 4:
                    banco.VerificarSaldo(in);
                    break;
                case 0:
                    System.out.println("Saindo");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida, tente novamente");
            }
        }
    }
}