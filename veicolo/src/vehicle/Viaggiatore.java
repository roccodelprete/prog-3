package vehicle;

public class Viaggiatore {
    public void viaggia(Automobile auto) {
        auto.accelera();
    }

    public void viaggia(Aereo aereo) {
        aereo.accelera();
    }

    public void viaggia(Nave nave) {
        nave.accelera();
    }
}
