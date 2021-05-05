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
public class NaturalNumberDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 8 example 1: ");
        NaturalNumber nn = new NaturalNumber(-3);
        try {
            nn.naturalNumber();
        } catch (NegativeNumberException | NumberZeroException ex) {
            System.out.println(ex + " " + ex.getMessage());
        }
    }

}
