package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 237.48; // Estimulando o valor do saldo, pois o usuário não precisa dizer a saldo da conta.
        
        System.out.print("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.print("Digite a sua agência: ");
        String agencia = scanner.next();
        
        System.out.print("Digite seu nome completo: ");
        scanner.nextLine(); //consumir quebra de linha pendente antes de prosseguir para a próxima entrada
        String nomeCompleto = scanner.nextLine();
        
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}




