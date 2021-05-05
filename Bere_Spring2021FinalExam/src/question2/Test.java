/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

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

        GeometricObject[] squares = {new Square(4.5), new Square(14),
            new Square(8.2), new Square(12), new Square(10)};

        System.out.println("Answer for question 2: ");
        for (int i = 0; i < squares.length; i++) {
            System.out.println("\nSquare #" + (i + 1));
            System.out.println("Area: " + squares[i].getArea());
            System.out.println("How to color: ");
            ((Square) squares[i]).howToColor();
        }
    }

}
