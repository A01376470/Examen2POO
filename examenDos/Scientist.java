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
public abstract class Scientist extends Human {
    protected int publishedPapers;
    public Scientist(){
        super();
        publishedPapers =0;
    }
    public int getPublishedPapers(){
        return publishedPapers;
    }
    public abstract void research();
}
