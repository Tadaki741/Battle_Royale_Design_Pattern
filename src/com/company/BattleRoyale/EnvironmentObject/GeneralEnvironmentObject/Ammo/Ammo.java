package com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Ammo;

import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.PickupableObject;

public abstract class Ammo extends PickupableObject {

    protected String ammoColor;
    protected int ammoCapacity;
    protected String ammoName;

    public Ammo(){
        this.ammoCapacity = 0;
    }


    public String getAmmoColor() {
        return ammoColor;
    }

    public void setAmmoColor(String ammoColor) {
        this.ammoColor = ammoColor;
    }

    public int getAmmoCapacity() {
        return ammoCapacity;
    }

    public void setAmmoCapacity(int ammoCapacity) {
        this.ammoCapacity = ammoCapacity;
    }

    public String getAmmoName() {
        return ammoName;
    }

    public void setAmmoName(String ammoName) {
        this.ammoName = ammoName;
    }

    public boolean hasEnoughAmmo(){
        return this.ammoCapacity > 0;
    }

    public void reduceAmmoWhenFiring(){
        //Continuously reducing ammo
        this.ammoCapacity = this.ammoCapacity - 1;
    }

}
