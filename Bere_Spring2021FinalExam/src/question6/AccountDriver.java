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
public class AccountDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 6 example 2: ");
        Account acc = new Account(52000, -9000);
        Account acc1 = new Account(9000, 12000);
        try {
            System.out.println(acc.pay());
        } catch (Exception e) {
            System.out.println(e + " " + e.getMessage());
        }
        try {
            System.out.println(acc1.balanceAmount());
        } catch (InsufficientBalanceException ex) {
            System.out.println(ex + " " + ex.getMessage());
        }
    }

}
