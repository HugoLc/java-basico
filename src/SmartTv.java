public class SmartTv {
    boolean ligada = false;
    int canal=1;
    int volume=25;

    public void ligarDesligar() {
        this.ligada = !this.ligada;
        System.out.println("Ligada?" + this.ligada);
    }
    public int mudarCanal(String seta ) {
        if(seta == "down"){
            return -- this.canal ;
        }
        else if(seta == "up"){
            return ++ this.canal ;
        }
        else{
            return this.canal;
        }
    }
    public int mudarCanal(int numeroCanal) {
        this.canal = numeroCanal;
        return this.canal;
    }
    private void aumentarVolume() {
        this.volume++;
    }
    private void diminuirVolume() {
        this.volume--;
    }

    public int alterarVolume(String seta) {
        if (seta == "up") {
            aumentarVolume();
        } else if(seta == "down"){
            diminuirVolume();
        } else {
            
        }
        return this.volume;
    }
}
