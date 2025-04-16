import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Por favor digite o número da conta:");
        int conta = scanner.nextInt();
        
        System.out.println("Por favor digite o número da agência:");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor digite o nome do cliente:");
        String nome = scanner.nextLine();

        System.out.println("Por favor digite saldo da conta:");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + conta + ", e seu saldo R$" + saldo +" já está disponível para saque.");

    }
}
