package Nivel1.Observable;

import Nivel1.Observer.Observer;

public interface Observable {

    public void addObserver(Observer observer);
    public void notifyObservers();
}
