package tech.ada.desafio2;

import tech.ada.desafio2.publisher.Editora;

public class Main {
    public static void main(String[] args) {

        Editora editora = new Editora();

        editora.notifyObservers(1);
        editora.notifyObservers(2);
    }
}
