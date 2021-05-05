/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author keerthi prayojitha bere
 */
public class WaterDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question3 example 2: ");
        WaterBodies wb = new WaterBodies();
        wb.saltWater();
        River river = new River();
        river.saltWater();
        wb = river;//implicit casting, subclass is assigned to superclass object
        wb.saltWater();
        // river = wb;//superclass to subclass is not valid
        river = (River) wb;//explicit casting, super class to subclass
        river.saltWater();
        WaterBodies w = new Ocean();//implicit casting, subclass to superclass
        w.saltWater();
        Ocean o = (Ocean) w;//explicit casting, assigning superclass object to subclass
        o.saltWater();
    }

}
