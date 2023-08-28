
package sistemasSmartTv;

public class SmartTv {
    boolean ligada = false; // inicia a tv desligada
    int canal = 1; // no canal 1
    int volume = 25; // com volume 25
    
    public void mudarcanal(int novoCanal){ // cria um métado para trocar de canal escolhendo o número
        canal = novoCanal;
    }
    
    public void aumentarCanal(){ // outro métado para aumentar canal de um em um
        canal++;
    }
    
    public void diminuirCanal(){ // outro métado para diminuir canal de um em um
        canal--; 
    }
    
    public  void aumentarVolume(){ // aumentar o volume de um em um
        volume++;
    }
    
    public  void diminuirVolume(){ // diminuir o volume de um em um
        volume--;
    }
    
    public void ligar(){ // para ligar a tv
        ligada = true;
    }
    public void desligar(){ // desligar a tv
        ligada = false;
    }
}
