package com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Ammo;

public class LightAmmo extends Ammo{



    public LightAmmo(int capacity){
        this.ammoCapacity = capacity;
        this.setAmmoColor("light orange");
        this.objectColor = "light orange";
        this.setShape("square box");
        this.setName("Ammo");
    }
}
