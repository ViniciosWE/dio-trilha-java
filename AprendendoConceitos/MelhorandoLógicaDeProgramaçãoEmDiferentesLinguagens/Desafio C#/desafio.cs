using System;

class desafio 
{
  public static void Main (string[] args) 
  {
    Console.Write("Digite o valor do salário: ");
    float valorSalario = float.Parse(Console.ReadLine());
    Console.Write("Digite o valor do benefício: ");
    float valorBeneficio = float.Parse(Console.ReadLine());

    float valorImposto = 0;
        
    if (valorSalario >= 0 && valorSalario <= 1100)
    { 
      valorImposto = 0.05F * valorSalario;
    }
    else if(valorSalario >= 1100.01 && valorSalario <= 2500.00)
    {
      valorImposto = 0.10F * valorSalario;
    }
    else
    {
      valorImposto = 0.15F * valorSalario;
    }
    float saida = valorSalario - valorImposto + valorBeneficio;
    Console.WriteLine(saida.ToString("0.00"));
  }
}