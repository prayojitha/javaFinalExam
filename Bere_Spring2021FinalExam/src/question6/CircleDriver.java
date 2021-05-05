/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author keerthi prayojitha bere
 */
public class CircleDriver {

    /**
     * @param args the command line argument
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 6 example 1:");
        Circle c = new Circle(-2);
        Circle c1 = new Circle(0);
        try {
            System.out.println(c.getDiameter());
        } catch (Exception e) {
            System.out.println(e + " " + e.getMessage());
        }
        try {
            System.out.println(c1.getArea());
        } catch (Exception e) {
            System.out.println(e + " " + e.getMessage());
        }
    }

}
