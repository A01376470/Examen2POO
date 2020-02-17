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
public class Morty extends Human implements MultiverseEntity {
    private final int HOMEWORLD;
    public Morty(int homeWorld){
        super();
        HOMEWORLD = homeWorld;
    }
    @Override
    public int getHomeWorld(){
        return HOMEWORLD;
    }
    @Override
    public void attack(){
        flee();
    }
    @Override
    public void flee(){
        System.out.println("MORTY (" + HOMEWORLD + "): I don't wanna die Rick...");
    }
    @Override
    public void die(){
        System.out.println("MORTY (" + HOMEWORLD + "): Aughhhh");
        alive=false;
    }
}
