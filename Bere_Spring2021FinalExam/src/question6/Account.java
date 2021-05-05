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
public class Account {

    double balance;
    double amountTopay;

    public Account(double balance, double amountTopay) {
        this.balance = balance;
        this.amountTopay = amountTopay;
    }

    public double pay() {
        if (amountTopay < 0) {
            throw new IllegalStateException("Balance is not sufficient to pay");

        }
        return amountTopay;
    }

    public double balanceAmount() throws InsufficientBalanceException {
        if ((balance - amountTopay) < 0) {
            throw new InsufficientBalanceException("balance is " + (balance - amountTopay) + " : balance cannot be less than zero");
        }
        return (balance - amountTopay);
    }

}
