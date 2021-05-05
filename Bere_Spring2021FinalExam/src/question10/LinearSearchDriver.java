/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

import java.util.Scanner;
import static question10.LinearSearch.LinearSearch;

/**
 *
 * @author keerthi prayojitha bere
 */
public class LinearSearchDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Input search item ");
        Scanner sc = new Scanner(System.in);
        int searchItem = sc.nextInt();
        int[] list = {30, 60, 90, 100};
        int result = LinearSearch(list, 0, searchItem);
        if (result < 0) {
            System.out.println(searchItem + " is not found");
        } else {
            System.out.println(searchItem + " is found at " + result);
        }

    }

}
