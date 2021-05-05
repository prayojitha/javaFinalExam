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
public class Dog {

    String dogName;
    boolean collar;
    boolean leash;

    public Dog(String dogName) {
        this.dogName = dogName;
    }

    public void collar() {

        this.collar = true;
        System.out.println("Collar is put on");
    }

    public void leash() {
        this.collar = false;
        System.out.println("leash is put on");
    }

    public void walk() throws DogIsNotReadingForWalkingException {
        if (!collar && !leash) {
            throw new DogIsNotReadingForWalkingException(dogName + " is not ready for walking");
        } else {
            System.out.println(dogName + " is ready for walking");
        }
    }

}
