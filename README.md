# Battle_Royale_Design_Pattern
My attempt to replicate the object design pattern of a battle royale game
This is how i see object interacts with each other on a battle royale type
You might implement some character class for the player to select

In general, we have 2 types of class: Player and Environmental Object
In player class: we might have Medic, Defensive, Offensive and Recon
In Environmental Object => PickupableObject => Gun + Ammo + Consumable + Throwable

Throwable: Grenade + Molotov
Consumable: Medkit + Shield (not implemented)
Ammo: LightAmmo + Heavy + SniperAmmo + Energy (implemented Light and Sniper ammo)
Gun: AssaultRifle + Sniper + Shotgun + SMG + LMG + Pistol (implemented AR and Sniper).
