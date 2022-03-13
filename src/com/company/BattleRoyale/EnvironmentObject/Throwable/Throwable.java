package com.company.BattleRoyale.EnvironmentObject.Throwable;

import com.company.BattleRoyale.EnvironmentObject.PickupableObject;

public abstract class Throwable extends PickupableObject {

    //Constructor
    public Throwable(){
        this.setName("Wide range explosives");
        this.setUsage("Throw at enemy to inflict damage");
        this.setShape("small and rounded or spike-like");
    }

    @Override
    public String toString() {
        return "Throwable{" +
                "objectName='" + objectName + '\'' +
                ", objectColor='" + objectColor + '\'' +
                ", objectShape='" + objectShape + '\'' +
                ", objectUsage='" + objectUsage + '\'' +
                ", associatedPlayer=" + associatedPlayer +
                '}';
    }

    //Throwable finally explodes
    public abstract void explode();
}
