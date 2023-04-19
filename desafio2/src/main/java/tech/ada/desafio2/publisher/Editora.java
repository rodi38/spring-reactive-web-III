package tech.ada.desafio2.publisher;

import tech.ada.desafio2.listeners.MagazineCar;
import tech.ada.desafio2.listeners.MagazineGame;
import tech.ada.desafio2.listeners.Observer;
import tech.ada.desafio2.listeners.ShounenJump;

import java.util.ArrayList;
import java.util.List;


public class Editora {
    private List<Observer> observers = new ArrayList<>();

    public Editora() {
        observers.add(new ShounenJump());
        observers.add(new MagazineCar());
        observers.add(new MagazineGame());
    }

    public void notifyObservers(int number) {
        System.out.println("Number: " + number);
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
