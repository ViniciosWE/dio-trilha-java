
package cursodiojava;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
        Scanner en = new Scanner (System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String nome = en.next();
        
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = en.next();
        
        System.out.println("Digite sua idade: ");
        int idade = en.nextInt();
        
        System.out.println("Digite sua altura: ");
        double altura = en.nextDouble();
        
        System.out.println("Óla, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
        en.close();
        }
        catch(InputMismatchException e){
            //testando o "err"
            System.err.println("Os campos idade e alturam precisam ser numéricos");
        }    
    }
}
