import observerPackage.Observable;

public class Main {
    public static void main(String[] args) {
        Observable observable = new Observable();

        new observerPackage.HexObserver(observable);
        new observerPackage.OctObserver(observable);
        new observerPackage.BinObserver(observable);
        new observerPackage.IntObserver(observable);

        while (true) {
            observable.setState((int)(Math.random() * 100));
        }
    }
}