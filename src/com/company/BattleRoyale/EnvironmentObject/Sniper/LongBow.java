package com.company.BattleRoyale.EnvironmentObject.Sniper;

public class LongBow extends Sniper {


   public LongBow() {
        this.setFireRate(70);
        this.setAmmoType("Sniper purple ammo");
        this.setSniperCodeName("Desert accuracy");
        this.setManufacturingCountry("Hammond Robotic");
    }

    @Override
    public String toString() {
        return "LongBow{" +
                "manufacturingCountry='" + manufacturingCountry + '\'' +
                ", fireRate=" + fireRate +
                ", ammoType='" + ammoType + '\'' +
                ", sniperCodeName='" + sniperCodeName + '\'' +
                '}';
    }


    @Override
    public void reloadingEmptyMag() {
        System.out.println("LongBow reloading empty");
    }

    @Override
    public void reloadingNormalMag() {
        System.out.println("LongBow reloading normal");
    }

    @Override
    public void gunFire() {
        System.out.println("LongBow firing !");
    }

    @Override
    public void gunInspecting() {
        System.out.println("Inspecting LongBow gun");
    }


}
