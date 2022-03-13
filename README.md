# Battle_Royale_Design_Pattern
My attempt to replicate the object design pattern of a battle royale game
This is how i see object interacts with each other on a battle royale type
You might implement some character class for the player to select

In general, we have 2 types of class: Player and Environmental Object
               Player
                  |
                  |
                  |
__________________|__________________
|             |        |            |
Defensive   Medic   Offensive     Recon



                        EnvironmentObject
                                |
                        PickupableObject
                                |
                                |
________________________________|___________________________________________________________________________
    |                        |                                |                                            |
Throwable                Consumable                         Ammo                                         Weapon
    |                        |                                |                                            |
____|________            ____|______          ________________|_____________         ______________________|___________________
|           |            |         |          |       |       |            |         |        |       |       |           |
Grenade   Molotov      Medkit     Shield    Light   Sniper   Energy      Heavy      Sniper   LMG     SMG    Shotgun  AssaultRifle
                                                                                     |                                    |
                                                                                     |                                    |
                                                                                     |                                    |
                                                                             ________|__________                   _______|____
                                                                             |       |        |                    |          |
                                                                          Sentinel  Longbow  Kraber               R301      HAVOC
                                                                          
                                                                          
                                                                          
                                                                          
