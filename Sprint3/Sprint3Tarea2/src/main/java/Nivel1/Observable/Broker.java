package Nivel1.Observable;

import Nivel1.Observer.Observer;

import java.util.ArrayList;
import java.util.Arrays;

public class Broker implements Observable {

    private String name;
    private ArrayList<Observer> observers = new ArrayList<>();
    private int balanceValue = 0;

    public Broker(String name) {
        this.name = name;
    }

    public void setNewMovement() {
        balanceValue = balanceValue + 100;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        if (observers == null) {
            observers.add(observer);
            return;
        }
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(balanceValue);
        }
    }
}
