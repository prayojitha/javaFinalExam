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
public class RegistrationDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 9 example 1: ");
        Registration register = new Registration();
        try {
            register.checkAgeEligibilty(9);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}
