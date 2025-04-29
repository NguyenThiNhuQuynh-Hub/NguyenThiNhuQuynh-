package ObserverPattern.New.Base;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void attachObserver(Observer observer) { //<-- Phương thức này
        this.observers.add(observer);
    }

    public void detachObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(Object arg) {
        for (Observer observer : this.observers) {
            observer.notify(arg);
        }
    }
}