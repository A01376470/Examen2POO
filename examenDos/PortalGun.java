/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itesm.examenDos;

/**
 *
 * @author luis_
 */
public class PortalGun implements MultiverseEntity {
    private final int HOMEWORLD;
    public PortalGun(int homeWorld){
        HOMEWORLD=homeWorld;
    }
    @Override
    public int getHomeWorld(){
        return HOMEWORLD;
    }
    public void openPortal(){
        System.out.println("PortalGun ("+HOMEWORLD+"): Opening portal...");
    }
    public void shoot(){
        System.out.println("PortalGun ("+HOMEWORLD+"): Bang bang bang...");
    }
}
