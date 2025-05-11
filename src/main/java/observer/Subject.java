package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void add(Observer observer) {
//        TODO adicionar observer para ser notificado posteriormente
        observers.add(observer);
    }

    public void notifyObservers() {
//        TODO notificar observers adicionados
        observers.forEach(observer ->
                observer.update(this)
        );
    }

}

