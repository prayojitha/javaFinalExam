/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author keerthi prayojitha bere
 */
public class PasswordDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 8 example 2: ");
        Password password = new Password(" ");
        try {
            System.out.println(password.password());
        } catch (BlankPasswordException | InconsistentLengthException e) {
            System.out.println(e + " " + e);
        }
    }

}
