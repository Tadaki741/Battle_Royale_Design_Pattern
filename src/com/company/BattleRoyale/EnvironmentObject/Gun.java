package com.company.BattleRoyale.EnvironmentObject;


/*
General gun class including: Sniper, Shotgun, Assault Rifle, Heavy Machine Gun, Light Machine Gun, Pistol
 */


public abstract class Gun extends PickupableObject {

    protected String manufacturingCountry;
    protected double fireRate;
    protected String ammoType;
    protected int damage;


    public Gun(){
    }

    //General Setter and Getter
    public String getManufacturingCountry() {
        return manufacturingCountry;
    }

    public void setManufacturingCountry(String manufacturingCountry) {
        this.manufacturingCountry = manufacturingCountry;
    }

    public double getFireRate() {
        return fireRate;
    }

    public void setFireRate(double fireRate) {
        this.fireRate = fireRate;
    }

    public String getAmmoType() {
        return ammoType;
    }

    public void setAmmoType(String ammoType) {
        this.ammoType = ammoType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    //Gun reloading empty
    public abstract void reloadingEmptyMag();


    //Gun reloading still bullet in magazine
    public abstract void reloadingNormalMag();

    //Fire
    public abstract void  gunFire();


    //Play with gun
    public abstract void gunInspecting();

}
