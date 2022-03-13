package com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Gun.AssaultRifle;

public class R301 extends AssaultRifle{

    public R301() {
        this.setFireRate(70);
        this.setAmmoType("Assault Rifle light orange ammo");
        this.setAssaultRifleCodeName("The Balance Order");
        this.setManufacturingCountry("Nockcron Technology");
        this.setDamage(55);
    }

    @Override
    public String toString() {
        return "R301{" +
                "manufacturingCountry='" + manufacturingCountry + '\'' +
                ", fireRate=" + fireRate +
                ", ammoType='" + ammoType + '\'' +
                ", damage=" + damage +
                '}';
    }

    @Override
    public void reloadingEmptyMag() {
        //Probably some animation ?
        System.out.println("R301 reloading empty");
    }

    @Override
    public void reloadingNormalMag() {
        //Probably some animation ?
        System.out.println("R301 reloading normal");
    }

    @Override
    public void gunFire() {
        //Probably some animation ?
        try {

            if (this.getAssociatedPlayer().getPlayerLightAmmo().getAmmoCapacity() > 0) {
                this.getAssociatedPlayer().getPlayerLightAmmo().reduceAmmoWhenFiring();
                System.out.println("R301 firing !");
            } else {
                System.out.println("You ran out of Light Ammo");
            }
        }
        catch (NullPointerException e){
            System.out.println("Please pick up some light ammo");
        }
    }

    @Override
    public void gunInspecting() {
        //Probably some animation ?
        System.out.println("Inspecting R301 gun");
    }

}
