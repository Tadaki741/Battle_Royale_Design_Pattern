package com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Throwable;

public class Grenade extends Throwable{

    public Grenade(){
        this.setName("Hand Grenade");
    }

    @Override
    public void explode() {
        System.out.println("Grenade goes BOOM !");
    }
}
