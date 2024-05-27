import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         //criando o objeto scanner
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
         System.out.println("Bem vindo ao nosso banco! Para criar sua conta, por favor responda as perguntas a seguir:");
         
         System.out.println("Digite seu primeiro nome");
         String primeiroNome = scanner.next();

         System.out.println("Digite seu sobrenome");
         String sobreNome = scanner.next();
         
         System.out.println("Digite o número da sua agência");
         String agencia = scanner.next();
 
         System.out.println("Digite o número da sua conta (Apenas números)");
         int numero = scanner.nextInt();
         
         System.out.println("Digite o valor que você deseja depositar na sua conta");
         double saldo = scanner.nextDouble();
 
         
         //imprimindo os dados obtidos pelo usuario
         String nomeCliente = primeiroNome + " " + sobreNome;

         System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        
    }
}
