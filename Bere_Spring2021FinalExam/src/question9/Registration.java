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
public class Registration {

    public void checkAgeEligibilty(int studentage) {
        if (studentage < 12) {
            throw new ArithmeticException("Student is not eligible for registering course");
        } else {
            System.out.println("Student can register");
        }
    }

}
