/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author keerthi prayojitha bere
 */
public class InheritanceHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 4: ");

        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();
        if (fruit instanceof Fruit) { //true
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (fruit instanceof Orange) { //false
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (fruit instanceof Apple) { //true
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (fruit instanceof GoldenDelicious) { //true
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (fruit instanceof McIntosh) { //false
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (orange instanceof Orange) { //true
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (orange instanceof Fruit) { //true
            System.out.println("true");
        } else {
            System.out.println("false");
        }
//        if (orange instanceof Apple) { //false
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
        ((GoldenDelicious) fruit).makeAppleCider(); //yes
        //orange.makeAppleCider(); //object orange is not an instance of Apple 
        //class, it can’t invoke method makeAppleCider() in class Apple.

        orange.makeOrangeJuice(); //yes
        //fruit.makeOrangeJuice(); // object fruit is not an instance of 
        //Orange class, it can’t invoke method makeOrangeJuice() in class Orange.

        //Orange p = new Apple() ; //Apple cannot be converted to Orange
        //McIntosh p = new Apple() ; //Apple cannot be converted to Orange
        Apple p = new McIntosh(); //legal

    }

}
