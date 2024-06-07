import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número da conta: ");
        Numero = input.nextInt();
        input.nextLine();  

        System.out.println("Informe a Agência: ");
        Agencia = input.nextLine();

        System.out.println("Informe seu nome: ");
        NomeCliente = input.nextLine();

        System.out.println("Informe o saldo da conta: ");
        Saldo = input.nextDouble();

        input.close();

        System.out.println("Número da Conta: " + Numero);
        System.out.println("Agência: " + Agencia);
        System.out.println("Nome do Cliente: " + NomeCliente);
        System.out.println("Saldo: " + Saldo);

    }
}
