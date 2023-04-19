package tech.ada.desafio2.listeners;

import java.util.Random;

public class ShounenJump implements Observer {
    private String message;
    private Boolean newRelease;
    public ShounenJump() {
        this.message = "";
        this.newRelease = new Random().nextBoolean();
    }
    @Override
    public void update(){
        if(newRelease){
            message = "A new shounen manga is about to release, checkout our site for more info!!";
        } else {
            message = "Not even single release for this data, checkout later";
        }
        this.newRelease = new Random().nextBoolean();
        System.out.println("Shounen-jump: " + message);

    }
}
