package com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject;

import com.company.BattleRoyale.Player.Player;


/*
THIS IS A GENERAL CLASS FOR EVERY OBJECT THAT THE PLAYER CAN PICK UP
 */
public class PickupableObject {
    protected String objectName;
    protected String objectColor;
    protected String objectShape;
    protected String objectUsage;
    protected Player associatedPlayer;

    //Constructor
    public PickupableObject(String name, String color, String shape, String usage){
        this.objectName = name;
        this.objectColor = color;
        this.objectShape = shape;
        this.objectUsage = usage;
    }

    //Empty constructor for custom sub class constructor
    public PickupableObject() {

    }

    //Setter and Getter
    public void setName(String name){
        this.objectName = name;
    }

    public void setColor(String color){
        this.objectColor = color;
    }

    public void setShape(String shape){
        this.objectShape = shape;
    }

    public void setUsage(String usage){
        this.objectUsage = usage;
    }

    public String getName(){
        return this.objectName;
    }

    public String getColor(){
        return this.objectColor;
    }

    public String getShape(){
        return this.objectShape;
    }

    public String getUsage(){
        return this.objectUsage;
    }

    //Designate the true owner
    public void setAssociatedPlayer(Player player){
        this.associatedPlayer = player;
        System.out.println("The object " + this.getName() + " now belong to " + this.associatedPlayer.getPlayerName());
    }

    public Player getAssociatedPlayer(){
        return this.associatedPlayer;
    }

    @Override
    public String toString() {
        return "Object{" +
                "objectName='" + objectName + '\'' +
                ", objectColor='" + objectColor + '\'' +
                ", objectShape='" + objectShape + '\'' +
                ", objectUsage='" + objectUsage + '\'' +
                '}';
    }
}
