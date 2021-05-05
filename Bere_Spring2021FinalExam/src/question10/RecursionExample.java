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
public class RecursionExample {

    public void infiniteLoop(int a, int b) {
        if (a != b) {
            int m = (a + b) / 2;
            infiniteLoop(a, m);
            System.out.println(m);
            infiniteLoop(m, b);
        }
    }

}
