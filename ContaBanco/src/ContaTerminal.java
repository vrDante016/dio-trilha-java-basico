import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero da conta: ");
        Integer numero = sc.nextInt();
        System.out.println("Por favor, digite o número da Agéncia");
        String agencia = sc.next();
        System.out.println("Entre com o seu nome: ");
        String nome = sc.next();
        sc.nextLine();
        System.out.println("Entre com o saldo da conta: ");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia
        + ", conta " + numero + " e o seu saldo " + saldo + " ja esta disponivel para saque");
    }
}