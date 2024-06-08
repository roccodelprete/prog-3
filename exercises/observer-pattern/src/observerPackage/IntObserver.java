package observerPackage;

public class IntObserver extends Observer {
    public IntObserver(Observable observable) {
        this.observable = observable;
        this.observable.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Integer string: " + observable.getState());
    }
}
