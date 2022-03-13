package com.company;

import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Ammo.LightAmmo;
import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Ammo.SniperAmmo;
import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Gun.AssaultRifle.HAVOC;
import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Gun.AssaultRifle.R301;
import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Gun.Sniper.Kraber;
import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Gun.Sniper.LongBow;
import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Gun.Sniper.Sentinel;
import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Throwable.Grenade;
import com.company.BattleRoyale.EnvironmentObject.GeneralEnvironmentObject.Throwable.Molotov;
import com.company.BattleRoyale.Player.Player;

public class Main {

    public static void main(String[] args) {

        //Create snipers
        LongBow longBow = new LongBow();
        Sentinel sentinel = new Sentinel() ;
        Kraber kraber = new Kraber();

        //Create assault rifles
        R301 r301 = new R301();
        HAVOC havoc = new HAVOC();


        //Create throwable
        Grenade grenade = new Grenade();
        Molotov molotov = new Molotov();

        //Create ammo
        SniperAmmo sniperAmmo = new SniperAmmo(30);
        LightAmmo lightAmmo = new LightAmmo(30);

        //Create User
        Player player   = new Player("Tadaki","Noob","Defensive");

        //User actions
        player.pickUp(sentinel);
        player.pickUp(r301);
        player.pickUp(sniperAmmo);
        player.pickUp(lightAmmo);

        //Player try shooting primary sniper gun, tested working properly
        player.shootPrimaryGun();
        player.shootPrimaryGun();
        player.shootPrimaryGun();

        //Try shooting the r301 gun
        player.shootSecondaryGun();



        //-----------------------
        //Throw explosives tested, working properly, both when user has throwable and does not have
//       player.throwExplosive();
//       player.throwExplosive();
//       player.throwExplosive();






    }
}



