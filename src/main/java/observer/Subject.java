package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    // Referência utilizada: https://engsoftmoderna.info/cap6.html#observador
    
    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void add(Observer observer) {
        // adiciona observer para ser notificado posteriormente
        this.observers.add(observer);
    }

    public void notifyObservers() {
        // notificar observers adicionados
        Iterator it = observers.iterator(); // uso de iterator para caminhar no ArrayList que é observers
        while (it.hasNext()) {
            Observer obs = (Observer) it.next();
            obs.update(this); // chama o método update de cada observer presente na lista
        }
    }

}

