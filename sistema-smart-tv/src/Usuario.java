public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Antes? " +smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual? " +smartTv.canal);
        System.out.println("Volume atual? "+smartTv.volume);

        System.out.println("TV Ligada? " + smartTv.power);
        System.out.println("Canal Atual? " +smartTv.canal);
        

        /* smartTv.ligada();
        System.out.println("Novo status -> TV Ligada? " + smartTv.power);
        smartTv.desligada();
        System.out.println("Novo status -> TV Ligada? " + smartTv.power);*/
    }
}
