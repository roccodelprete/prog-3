package vehicle;

public class Nave extends Veicolo {
    @Override
    public void accelera() {
        System.out.println("nave goes crazy");

    }

    @Override
    public void decelera() {

    }

    public void gettaAncora() {
        System.out.println("ancora gettata");
    }
}
