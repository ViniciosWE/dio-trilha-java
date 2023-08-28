
package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digte o número da conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.print("Digite a agencia: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Digite se nome completo: " );
        String nomeCompleto = scanner.nextLine();
        
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numeroConta + "e seu saldo " + saldo + " já esta disponivel para saque");
    }
}
