/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author keerthi prayojitha bere
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 5");
        ComparableCircle comparableCircle1 = new ComparableCircle(12.5);
        ComparableCircle comparableCircle2 = new ComparableCircle(18.3);

        // Display comparableCircles
        System.out.println("ComparableCircle1:");
        System.out.println(comparableCircle1 + "\n");
        System.out.println("ComparableCircle2:");
        System.out.println(comparableCircle2);

        // Find and display the larger of the two ComparableCircle objects
        System.out.println((comparableCircle1.compareTo(comparableCircle2) == 1
                ? "ComparableCircle1 " : "ComparableCircle2 ")
                + "is the largest of the two Circles");
    }

}
