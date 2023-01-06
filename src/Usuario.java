public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV status: " + smartTv.ligada); 
        System.out.println("Canal:" + smartTv.canal); 
        System.out.println("Volume" + smartTv.volume); 

        smartTv.ligarDesligar();

        System.out.println("Canal atual:" +  smartTv.mudarCanal(23));
        System.out.println("Canal atual:" +  smartTv.mudarCanal("down"));

        // int volume = smartTv.aumentarVolume() metodo privado e retornando void
        int volume = smartTv.alterarVolume("up");
        System.out.println("Volume: " + volume);
    }
}
