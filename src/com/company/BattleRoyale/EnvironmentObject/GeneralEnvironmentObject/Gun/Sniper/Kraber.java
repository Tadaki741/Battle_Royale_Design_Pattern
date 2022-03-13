package com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Gun.Sniper;

public class Kraber extends Sniper{

    public Kraber(){
        this.setFireRate(50);
        this.setAmmoType("Unique ammo from care package");
        this.setSniperCodeName("Wall Penetration");
        this.setManufacturingCountry("Nortar Legion");
    }

    @Override
    public String toString() {
        return "Kraber{" +
                "manufacturingCountry='" + manufacturingCountry + '\'' +
                ", fireRate=" + fireRate +
                ", ammoType='" + ammoType + '\'' +
                ", sniperCodeName='" + sniperCodeName + '\'' +
                '}';
    }

    @Override
    public void reloadingEmptyMag() {
        System.out.println("Kraber reloading empty");
    }

    @Override
    public void reloadingNormalMag() {
        System.out.println("Kraber reloading normal");
    }

    @Override
    public void gunFire() {
        System.out.println("Kraber firing !");
    }

    @Override
    public void gunInspecting() {
        System.out.println("Inspecting Kraber gun");
    }
}
