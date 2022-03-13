package com.company.BattleRoyale.Player;

import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Ammo.Ammo;
import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Ammo.LightAmmo;
import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Ammo.SniperAmmo;
import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Gun.Gun;
import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Throwable.Throwable;

import java.util.ArrayList;

public class Player<T> {

    //Based information
    private String playerName;
    private String rank;
    private String characterClass;

    //Battlefield information
    private ArrayList<T> playerInventory;
    private Gun primaryGun;
    private Gun secondaryGun;
    private Throwable currentThrowable;
    private int playerHealth;
    private int playerShield;


    //Create new player
    public Player(String playerName, String rank, String characterClass) {
        this.playerName = playerName;
        this.rank = rank;
        this.playerHealth = 100;
        this.playerShield = 0;
        this.characterClass = characterClass;
        this.currentThrowable = null;
        this.playerInventory = new ArrayList<>();
    }


    //Setter and Getter for basic information
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }


    //Setter and Getter for battlefield
    public void setPrimaryGun(Gun primaryGun) {
        this.primaryGun = primaryGun;
        this.primaryGun.setAssociatedPlayer(this);
    }

    public void setSecondaryGun(Gun secondaryGun) {
        this.secondaryGun = secondaryGun;
        this.secondaryGun.setAssociatedPlayer(this);
    }

    //Get player inventory for fast access
    public ArrayList<T> getPlayerInventory() {
        return playerInventory;
    }


    //TODO: WRITE PLAYER ACTION
    //Pick up object from the ground
    public void pickUp(T object) {
        //If pick up gun, replace current primary or secondary
        if (object instanceof Gun) {

            //If player has empty slot
            if (this.primaryGun == null && this.secondaryGun == null) {
                this.setPrimaryGun((Gun) object);
            } else if (this.primaryGun == null && this.secondaryGun != null) {
                this.setPrimaryGun((Gun) object);
            } else if (this.primaryGun != null && this.secondaryGun == null) {
                this.setSecondaryGun((Gun) object);
            }
            //User already occupied 2 slots
            else {
                System.out.println("please empty one of your gun slot");
            }
        }

        //If pickup throwable or consumable, add to inventory
        else {
            if (object instanceof Throwable) {
                this.playerInventory.add(object);
                ((Throwable) object).setAssociatedPlayer(this);
            }
            else if(object instanceof Ammo){
                this.playerInventory.add(object);
                ((Ammo)object).setAssociatedPlayer(this);
            }
        }
    }

    //Shoot their primary gun
    //TODO: Need to check if the gun shoot correct ammo, can't have a LMG gun shoot ammo of shotgun type
    public void shootPrimaryGun() {
        if (this.primaryGun == null) {
            System.out.println("Your primary gun slot is empty");
        } else {
            this.primaryGun.gunFire();
        }

    }

    //Shoot secondary gun
    public void shootSecondaryGun() {
        if (this.secondaryGun == null) {
            System.out.println("Your secondary slot is empty");
        } else {
            this.secondaryGun.gunFire();
        }
    }


    //Throw some throwable
    public void throwExplosive() {

        if (this.hasThrowable()) {
            System.out.println("User throwing: " + this.currentThrowable.getName());
            this.currentThrowable.explode();

            //Update inventory
            this.playerInventory.remove(this.currentThrowable);
        } else {
            System.out.println("Your inventory has no throwable");
            //Release the object, in case the inventory has no throwable but the currentThrowable still
            //hold 1 throwable
            this.currentThrowable = null;
        }
    }


    //Check if user has grenade
    public boolean hasThrowable() {
        int size = this.playerInventory.size();

        for (int i = 0; i < size; i++) {
            if (playerInventory.get(i) instanceof Throwable) {
                this.currentThrowable = (Throwable) playerInventory.get(i);
                return true;
            }
        }

        return false;

    }


    //Setter and Getter to find correct ammo type for the gun
    public SniperAmmo getPlayerSniperAmmo(){
        int size = this.playerInventory.size();
        for(int i = 0 ; i < size ; i++){
            if(playerInventory.get(i) instanceof SniperAmmo){
                //Check for ammo stock capacity
                return (SniperAmmo) playerInventory.get(i);
            }
        }

        return null;
    }

    public LightAmmo getPlayerLightAmmo(){
        int size = this.playerInventory.size();
        for(int i = 0 ; i < size ; i++){
            if(playerInventory.get(i) instanceof LightAmmo){
                //Check for ammo stock capacity
                return (LightAmmo) playerInventory.get(i);
            }
        }

        return null;
    }


}


