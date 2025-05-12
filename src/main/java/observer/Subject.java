package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void add(Observer observer) {
        observers.add(observer); // ✅ Adiciona um observer à lista
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this); // ✅ Notifica cada observer passando o próprio subject
        }
    }
}
