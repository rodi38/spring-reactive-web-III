package tech.ada.desafio2.listeners;


import java.util.Random;

public class MagazineGame implements Observer {

    private String message;
    private Boolean newRelease;
    public MagazineGame() {
        this.message = "";
        this.newRelease = new Random().nextBoolean();
    }
    @Override
    public void update(){
        if(newRelease){
            message = "Checkout this new Kojima game release, is completly absurd and amazing!!!";
        } else {
            message = "No one game for today, checkout later";
        }
        this.newRelease = new Random().nextBoolean();
        System.out.println("MagazineGame: " + message);

    }
}
