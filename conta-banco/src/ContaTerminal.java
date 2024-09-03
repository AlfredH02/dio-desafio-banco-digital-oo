import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo, informe abaixo as informações para criar uma conta em nosso banco.");

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite o número da conta: ");
        int conta = sc.nextInt();

        System.out.printf("Digite o número da agência: ");
        int agencia = sc.nextInt();

        System.out.println("Informe o saldo para depósito: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", " +
                "obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + conta +
                " e seu saldo " + saldo + " já está disponível para saque.");

    }
}