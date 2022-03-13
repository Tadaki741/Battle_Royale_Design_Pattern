package com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Gun.AssaultRifle;

import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Gun.Gun;


public abstract class AssaultRifle extends Gun {


    protected String AssaultRifleCodeName;


    public AssaultRifle(){
        //Specify default information
        this.setUsage("Close-Mid-Long range battle rifle");
        this.setName("General Purpose Combat rifle");
    }


    //Setter and Getter
    public String getAssaultRifleCodeName() {
        return AssaultRifleCodeName;
    }



    @Override
    public String toString() {
        return "AssaultRifle{" +
                "manufacturingCountry='" + manufacturingCountry + '\'' +
                ", fireRate=" + fireRate +
                ", ammoType='" + ammoType + '\'' +
                ", damage=" + damage +
                '}';
    }

    public void setAssaultRifleCodeName(String assaultRifleCodeName) {
        AssaultRifleCodeName = assaultRifleCodeName;
    }

    @Override
    public void reloadingEmptyMag() {

    }

    @Override
    public void reloadingNormalMag() {

    }

    @Override
    public void gunFire() {

    }

    @Override
    public void gunInspecting() {

    }
}
