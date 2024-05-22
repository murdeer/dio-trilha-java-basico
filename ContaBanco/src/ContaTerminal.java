import java.util.Scanner;
import java.util.Locale;

/**
 * Programa que representa a abertura de uma conta bancária.
 * O usuário deverá digitar dados como agencia, numero de conta
 * nome e valor do deposito
 * Autor: Rafael Barbatana.
 * Data: 22/05/2024.
 */
public class ContaTerminal {

    /**Método principal
     * @param args Argumento via linha de comando
     */
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor digite o numero da agência: ");
        String agencia = sc.nextLine();
        
        System.out.println("Digite o numero da conta: ");
        int numero = sc.nextInt();

        //consumir linha pendente
        sc.nextLine();
        
        System.out.println("Agora digite o seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Agora para finalizar digite o valor do deposito");
        float saldo = sc.nextFloat();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta no nosso banco, " 
        + "sua agencia é " + agencia + ", conta " + numero + " e seu saldo " + saldo
        + " já está disponível para saque.");
        
        sc.close();

    }
}
