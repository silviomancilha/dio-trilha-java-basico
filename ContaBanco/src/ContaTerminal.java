import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a calse Scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para o usuário e obter os valores digitados no terninal
        System.out.println("Por favor, digite o número da Agência !");
        String numeroAgencia = scanner.next(); //utilizado String, pois agência pode começar com digito zero
       
        System.out.println("Por favor, digite o número da conta !");
        String numeroConta = scanner.next();
       
        System.out.println("Por favor, digite o nome do cliente !");
        String nomeCliente = scanner.next(); 
      
        System.out.println("Por favor, digite o saldo inicial !");
        double valorSaldo = scanner.nextDouble();
        
        // Exibir a mensagem da conta criada
        System.out.println("Olá" + nomeCliente + "," + "\nobrigado por criar uma conta em nosso banco,\nsua agência é " + numeroAgencia + " conta " + numeroConta + "\n e seu saldo é de R$ " + valorSaldo + " já está disponível para saque");

        
    }
}
