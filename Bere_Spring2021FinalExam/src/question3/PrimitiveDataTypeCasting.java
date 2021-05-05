/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author keerthi prayojitha bere
 */
public class PrimitiveDataTypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 3 example 1: ");
        int x = 10;
        double y = x;// implicit casting, converting int datatype variable to double
        System.out.println(y);
        double m = 10.5;
        int n = (int) m; //explicit casting converting double datatype to int
        System.out.println(n);
        String data = "10";
        System.out.println("The string value is: " + data);

        int num = Integer.parseInt(data); //converting string to int datatypes
        System.out.println("The integer value is: " + num);

    }

}
