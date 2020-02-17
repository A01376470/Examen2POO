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
public class examenTest {
    public static void main(String[] args) {
        
        final int UNIVERSE_ID = 137;
        
        Human rick = new Rick(UNIVERSE_ID);
        System.out.println("Rick is alive? " + rick.isAlive());
        System.out.println("Rick is fighting agains aliens...");
        rick.attack();
        rick.flee();
        
        Scientist scientistRick = (Scientist)rick;
        System.out.println("Scientist rick has published " + scientistRick.getPublishedPapers() + " papers.");
        
        Rick realRick = (Rick)rick;
        realRick.research();
        System.out.println("Real rick, from universe " + realRick.getHomeWorld() + ", has published " + realRick.getPublishedPapers() + " papers");
        realRick.burp();
        
        Human morty = new Morty(UNIVERSE_ID);
        System.out.println("Morty is alive? " + morty.isAlive());
        morty.attack();
        
        Morty realMorty = (Morty)morty;
        realRick.setMorty(realMorty);
        
        realRick.attack();
        realRick.burp();
        realRick.flee();
        morty.flee();
        rick.die();
        morty.die();
        
        System.out.println("Rick is alive? " + rick.isAlive());
        System.out.println("Morty is alive? " + morty.isAlive());
        
        
        MultiverseEntity[] entities = new MultiverseEntity[5];
        entities[0] = realRick;
        entities[1] = realMorty;
        entities[2] = new Rick(102);
        entities[3] = new Morty(167);
        entities[4] = new PortalGun(6);
        
        for(MultiverseEntity e: entities) {
            printMultiverseEntity(e);
        }
        
    }
    
public static void printMultiverseEntity(MultiverseEntity entity) {
    System.out.println("El objeto de clase " + entity.getClass().toString() + " pertenece al universo " + entity.getHomeWorld());
}    
    
}
