package com.company.BattleRoyale.EnvironmentObject.Sniper;

import com.company.BattleRoyale.EnvironmentObject.Gun;

public abstract class Sniper extends Gun {


    protected String sniperCodeName;


    //Default constructor
    public Sniper(){
        //Specify default information
        this.setUsage("Long range battle rifle");
        this.setName("Military Sniper");
    }



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

    public String getSniperCodeName() {
        return sniperCodeName;
    }

    public void setSniperCodeName(String sniperCodeName) {
        this.sniperCodeName = sniperCodeName;
    }



    @Override
    public String toString() {
        return "Sniper{" +
                "manufacturingCountry='" + manufacturingCountry + '\'' +
                ", fireRate=" + fireRate +
                ", ammoType='" + ammoType + '\'' +
                ", sniperCodeName='" + sniperCodeName + '\'' +
                '}';
    }

    @Override
    public void reloadingEmptyMag() {
        System.out.println("Sniper class reloading empty mag");
    }

    @Override
    public void reloadingNormalMag() {
        System.out.println("Sniper class reloading normal mag");
    }

    @Override
    public void gunFire() {
        System.out.println("Sniper class firing");
    }

    @Override
    public void gunInspecting() {
        System.out.println("Sniper class inspecting");
    }

}

