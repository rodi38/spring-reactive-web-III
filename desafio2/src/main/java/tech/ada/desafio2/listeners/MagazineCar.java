package tech.ada.desafio2.listeners;

import java.util.Random;

public class MagazineCar implements Observer {
    private String message;
    private Boolean newRelease;
    public MagazineCar() {
        this.message = "";
        this.newRelease = new Random().nextBoolean();
    }
    @Override
    public void update(){
        if(newRelease){
            message = "Check right now our web-site!! A new car just released today, is amazing!!!";
        } else {
            message = "No one new car for today, check later.";
        }
        this.newRelease = new Random().nextBoolean();
        System.out.println("MagazineCar: " + message);

    }
}
