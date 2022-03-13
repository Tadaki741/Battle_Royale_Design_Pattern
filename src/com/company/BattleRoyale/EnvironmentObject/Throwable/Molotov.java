package com.company.BattleRoyale.EnvironmentObject.Throwable;

public class Molotov extends Throwable{

    public Molotov (){
        this.setName("Molotov");
    }

    @Override
    public void explode() {
        System.out.println("Molotov flame spreading !");
    }
}
