public class Lampada {
    
    public void apagarLampada(){
        System.out.println("apagar");
    }

    public void acenderLampada(){
        System.out.println("acender");
    }

    public void mudarCor(){
        System.out.println("vermelho");
    }

    public static void main(String[] args) {
        Lampada minhaLampada = new Lampada();
        minhaLampada.acenderLampada();
        minhaLampada.apagarLampada();
        minhaLampada.mudarCor();
    }
}