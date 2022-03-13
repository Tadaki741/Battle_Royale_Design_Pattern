package com.company.BattleRoyale.EnvironmentObject.Ammo;

import java.util.ArrayList;

public class SniperAmmo extends Ammo{


    public SniperAmmo(int capacity){
        this.setAmmoCapacity(capacity);
        this.setAmmoName("Sniper Ammo");
        this.objectColor="purple";
        this.setAmmoColor("purple");
        this.setShape("square box");
        this.setName("Ammo");
    }



}
