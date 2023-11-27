package observerPackage;

public class BinObserver extends Observer {
    public BinObserver(Observable observable) {
        this.observable = observable;
        this.observable.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary string: " + Integer.toBinaryString(observable.getState()));
    }
}
