package observerPackage;

import java.util.ArrayList;

public class Observable {
    private ArrayList<Observer> observers = new ArrayList<>();
    private int state;

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    private void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }


}
