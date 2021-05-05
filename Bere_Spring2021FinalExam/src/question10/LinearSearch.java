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
public class LinearSearch {

    public static int LinearSearch(int[] list, int index, int searchItem) {
        if (index >= list.length) {
            return -1;
        }
        if (list[index] == searchItem) {
            return index;
        }
        return LinearSearch(list, index + 1, searchItem);
    }

}
