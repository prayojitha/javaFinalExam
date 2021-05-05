/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author keerthi prayojitha
 */
public class ArrayRandomIntegers {

    public static int[] getArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }
        return array;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 7: ");
        Scanner input = new Scanner(System.in);

        int[] array = getArray();

        System.out.print("Enter array index: ");
        try {
            System.out.println("The corresponding index element value is "
                    + array[input.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }
    }

}
