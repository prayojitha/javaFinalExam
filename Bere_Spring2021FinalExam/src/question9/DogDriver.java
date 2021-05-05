/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author keerthi prayojitha bere
 */
public class DogDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 9 example 2: ");
        Dog dog = new Dog("Leo");
        dog.collar();
        dog.leash();
        try {
            dog.walk();
        } catch (DogIsNotReadingForWalkingException ex) {
            System.out.println(ex + " " + ex.getMessage());
        }
    }

}
