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
public class RecursionPalindrome {

    public boolean palindromeCheck(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return palindromeCheck(s.substring(1, s.length() - 1));
        }
        return false;
    }

}
