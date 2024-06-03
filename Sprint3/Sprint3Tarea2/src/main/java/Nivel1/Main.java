package Nivel1;

import Nivel1.Observable.Broker;
import Nivel1.Observer.Agency;

public class Main {

    public static void main(String[] args) {

        Agency agency = new Agency("Agencia 1");
        Broker broker = new Broker("Broker 1");

        broker.addObserver(agency);

        broker.setNewMovement();

        Agency agency2 = new Agency("Agencia 2");
        broker.addObserver(agency2);
        broker.setNewMovement();

        Agency agency3 = new Agency("Agencia 3");
        broker.setNewMovement();

    }


}
