/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author keerthi prayojitha bere
 */
public class RecursionPalindromeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 10 example 1: ");
        RecursionPalindrome r = new RecursionPalindrome();
        boolean flag = r.palindromeCheck("sitonapanotis");
        System.out.println(flag);
        flag = r.palindromeCheck("nine");
        System.out.println(flag);
        flag = r.palindromeCheck("amanaplanacanalpanama");
        System.out.println(flag);

    }

}
