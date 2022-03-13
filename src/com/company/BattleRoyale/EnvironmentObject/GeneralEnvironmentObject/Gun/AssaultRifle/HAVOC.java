package com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Gun.AssaultRifle;

public class HAVOC extends AssaultRifle{

    public HAVOC(){
        this.setAssaultRifleCodeName("The energy mage");
        this.setAmmoType("energy ammo");
        this.setDamage(56);
        this.setManufacturingCountry("COBOL Engineering");
        this.setFireRate(60);
    }

    @Override
    public String toString() {
        return "HAVOC{" +
                "manufacturingCountry='" + manufacturingCountry + '\'' +
                ", fireRate=" + fireRate +
                ", ammoType='" + ammoType + '\'' +
                ", damage=" + damage +
                '}';
    }

    @Override
    public void reloadingEmptyMag() {
        //Probably some animation ?
        System.out.println("HAVOC reloading empty");
    }

    @Override
    public void reloadingNormalMag() {
        //Probably some animation ?
        System.out.println("HAVOC reloading normal");
    }

    @Override
    public void gunFire() {
        //Probably some animation ?
        System.out.println("HAVOC firing !");
    }

    @Override
    public void gunInspecting() {
        //Probably some animation ?
        System.out.println("Inspecting HAVOC gun");
    }
}
