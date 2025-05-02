package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        observers.forEach(observer ->
                observer.update(this)
        );
    }

}

