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
public class Rick extends Scientist implements MultiverseEntity {
    private final int HOMEWORLD;
    private PortalGun myPortalGun;
    private Morty morty;
    public Rick(int homeWorld){
        super();
        HOMEWORLD=homeWorld;
        myPortalGun = new PortalGun(HOMEWORLD);
        morty=null;
    }
    @Override
    public int getHomeWorld(){
        return HOMEWORLD;
    }
    public void setMorty(Morty morty){
        this.morty=morty;
        System.out.println("RICK ("+HOMEWORLD+"): Morty, You gotta come on. Jus'... You gotta come with me.");
        
    }
    public String burp(){
        return "BUUUUURP";
    }
    @Override
    public void attack(){
        if (morty!=null){
            System.out.println("RICK ("+HOMEWORLD+"): Fight, Morty!");
            morty.attack();
        } else {
            System.out.println("RICK ("+HOMEWORLD+"): Take this, you...");
            myPortalGun.shoot();
        }
        
    }
    @Override
    public void flee(){
        System.out.println("RICK ("+HOMEWORLD+"):Run Morty!");
        myPortalGun.openPortal();
    }
    @Override
    public void die(){
        if (morty!=null){
            System.out.println("RICK ("+HOMEWORLD+"): Save yourself, Morty!");
        } else {
            System.out.println("RICK ("+HOMEWORLD+"): I will return...");
        }
        myPortalGun = null;
        alive=false;
    }
    @Override
    public void research(){
        publishedPapers++;
    }
    
}
