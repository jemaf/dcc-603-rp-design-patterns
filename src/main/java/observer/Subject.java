package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void add(Observer observer) {
        
        observers.add(observer);
    }

    public void notifyObservers() {
        
        Iterator it = observers.iterator();

        while (it.hasNext()) {
            Observer obs = (Observer) it.next();
            obs.update(this);
        }

    }

}
