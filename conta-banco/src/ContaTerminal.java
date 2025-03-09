import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número de sua agência:");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta:");
        int conta = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Digite seu nome:");
        String nomeDoCliente = scanner.nextLine();

        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeDoCliente + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
