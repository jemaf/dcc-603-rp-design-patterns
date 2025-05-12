package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    // Adicionar um observer à lista
    public void add(Observer observer) {
        this.observers.add(observer);
    }

    // Notificar todos os observers sobre uma mudança
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}