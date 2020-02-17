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
public abstract class Human {
    protected boolean alive;
    public Human(){
        alive=true;
    }
    public boolean isAlive(){
        return alive;
    }
    public abstract void attack();
    public abstract void flee();
    public abstract void die();
}
