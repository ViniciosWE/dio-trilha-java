
package AperfeicoandoLogicaProgramacao;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.print("Digite seu Salario: ");
        float valorSalario = en.nextFloat();
        System.out.print("Digite seus beneficios: ");
        float valorBeneficio = en.nextFloat();
        
        float valorImposto = 0;
        
        if (valorSalario >= 0 && valorSalario <= 1100) 
            valorImposto = 0.05F * valorSalario;
        else if(valorSalario >= 1100.01 && valorSalario <= 2500.00)
            valorImposto = 0.10F * valorSalario;
        else
            valorImposto = 0.15F * valorSalario;
        
        float saida = valorSalario - valorImposto + valorBeneficio;
        System.out.println(String.format("%.2f", saida));
    }
}
