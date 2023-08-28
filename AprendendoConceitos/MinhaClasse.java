
package AprendendoConceitos;

public class MinhaClasse {
    public static void main(String[] args) {
        final String BR = "Brasil"; // O valor nuca deve ser alterado, e deve ser escrito em caixa alta
        String primeiroNome = "Vinicios";
        String segundoNome = "Ebling";
        
        //puxando o métado nome completo, para fazer a junção do primeiroNome concatenando com o segundoNome
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome); // se tiver parametros devo declarar, se tiver mais que um, devo separar com vírgulas
        System.out.println(nomeCompleto); // imprimindo na tela
    }
    //criando outro métado diferente do métado main
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do métado: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
