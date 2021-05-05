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
public class Password {

    String password;

    public Password(String password) {
        this.password = password;
    }

    public String password() throws BlankPasswordException, InconsistentLengthException {
        if (password.isBlank()) {
            throw new BlankPasswordException("Password cannot be blank");
        } else if (((password.length() <= 0)) && ((password.length() >= 9))) {
            throw new InconsistentLengthException("password length should be greater than zero and less than 9");

        }
        return password;
    }
}
