import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public static void main(String[] args) throws Exception {
        ContaTerminal contaTerminal = new ContaTerminal();

        contaTerminal.capturarInformacoes();
        contaTerminal.imprimir();
    }

    public void imprimir() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }

    public void capturarInformacoes() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência" );
        agencia = scanner.next();

        System.out.println("Digite o número da conta" );
        numero = Integer.parseInt(scanner.next());

        System.out.println("Digite o seu nome" );
        nomeCliente = scanner.next();

        System.out.println("Digite o saldo da conta" );
        saldo = Double.parseDouble(scanner.next());

        scanner.close();
    }
}
