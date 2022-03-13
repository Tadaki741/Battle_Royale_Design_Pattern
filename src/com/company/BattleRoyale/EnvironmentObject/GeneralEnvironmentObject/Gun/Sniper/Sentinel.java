package com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Gun.Sniper;

public class Sentinel extends Sniper{


    private boolean isCharged;

    //Constructor
    public Sentinel(){
        this.setFireRate(64); // 64 bullet per minute
        this.setAmmoType("Sniper purple ammo");
        this.setSniperCodeName("Clean shot");
        this.setManufacturingCountry("Hammond Robotic");
        this.setDamage(68);
    }

    @Override
    public String toString() {
        return "Sentinel{" +
                "manufacturingCountry='" + manufacturingCountry + '\'' +
                ", fireRate=" + fireRate +
                ", ammoType='" + ammoType + '\'' +
                ", sniperCodeName='" + sniperCodeName + '\'' +
                '}';
    }

    @Override
    public void reloadingEmptyMag() {
        System.out.println("Sentinel reloading empty");
    }

    @Override
    public void reloadingNormalMag() {
        System.out.println("Sentinel reloading normal");
    }

    //TODO: Find a way to access the player inventory, search for the exact ammo stock, then reduce it
    @Override
    public void gunFire() {
        try {
            //Shoot when charging
            if (isCharged) {
                //Add checking for ammo capacity before firing
                if (this.getAssociatedPlayer().getPlayerSniperAmmo().getAmmoCapacity() > 0) {
                    System.out.println("Sentinel is firing in charged mode !");
                    this.getAssociatedPlayer().getPlayerSniperAmmo().reduceAmmoWhenFiring();
                } else {
                    System.out.println("You ran out of sniper ammo");
                }

            } else {
                //Normal mode
                //TODO: Add checking for ammo capacity before firing
                //check for ammo stock
                if (this.getAssociatedPlayer().getPlayerSniperAmmo().getAmmoCapacity() > 0) {
                    System.out.println("Sentinel is firing normally");
                    this.getAssociatedPlayer().getPlayerSniperAmmo().reduceAmmoWhenFiring();
                }
                //Empty sniper ammo stock
                else {
                    System.out.println("You ran out of sniper ammo");
                }

            }
        }
        catch (NullPointerException e){
            System.out.println("Please pickup some sniper ammo");
        }
    }

    //OLD WAY to reduce ammo stock when firing
    //this.getAssociatedPlayer().setSniperAmmo(this.getAssociatedPlayer().getSniperAmmo() - 1);

    @Override
    public void gunInspecting() {
        System.out.println("Inspecting Sentinel gun");
    }


    //Sentinel has a special charge up using the shield
    public void chargingUpSentinel(){
        System.out.println("Sentinel is charging up !");
        this.isCharged = true;
    }



}
