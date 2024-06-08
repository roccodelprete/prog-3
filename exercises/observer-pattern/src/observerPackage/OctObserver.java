package observerPackage;

public class OctObserver extends Observer {
    public OctObserver(Observable observable) {
        this.observable = observable;
        this.observable.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal string: " + Integer.toOctalString(observable.getState()));
    }
}
