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
public class NaturalNumber {

    int number;

    public NaturalNumber(int number) {
        this.number = number;
    }

    public int naturalNumber() throws NumberZeroException, NegativeNumberException {
        if (number == 0) {
            throw new NumberZeroException("Natural number cannot be zero");
        } else if (number < 0) {
            throw new NegativeNumberException("Natural number cannot be negative");
        }
        return number;
    }
}
