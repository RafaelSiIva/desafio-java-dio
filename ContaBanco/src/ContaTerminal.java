import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da Agencia: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a Agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite o Nome do Cliente: ");
        String nome = scanner.next();

        System.out.println("Digite o Sobrenome do Cliente: ");
        String sobrenome = scanner.next();

        System.out.println("Digite o seu Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
