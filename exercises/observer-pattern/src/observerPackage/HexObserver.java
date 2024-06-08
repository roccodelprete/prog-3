package observerPackage;

public class HexObserver extends Observer {
    public HexObserver(Observable observable) {
        this.observable = observable;
        this.observable.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex string: " + Integer.toHexString(observable.getState()));
    }
}
