
package sistemasSmartTv;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        smartTv.ligar(); // liga a tv 
        System.out.println("Novo Status: " + smartTv.ligada);
        
        smartTv.diminuirVolume(); // chama o metado diminuir volume 3 vezes e um para aumentar uma vez
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("volume atual: " + smartTv.volume);
        
         System.out.println("Canal anterior: " + smartTv.canal);
        
        smartTv.mudarcanal(12); // muda o canal para o 12
        System.out.println("Canal atual: " + smartTv.canal);
        
        smartTv.desligar(); // desliga a tv
        System.out.println("Novo Status: " + smartTv.ligada);
    }
}
