/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

/**
 *
 * @author keerthi prayojitha bere
 */
public class ShapeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 11 example 2: ");
        Shape shape = new Shape("Circle", 0);
        Shape shape1 = new Shape("Triangle", 3);
        Shape shape2 = new Shape("Square", 4);
        Shape shape3 = shape2;

        System.out.println("shape.equals(shape1) : " + shape.equals(shape1));
        //checking the equality of two objects shape and shape1, it returns 
        //false because they have different shapeName and different numberofsides 

        System.out.println("shape1.equals(shape2) : " + shape1.equals(shape2));
        //checking the equality of two objects shape1 and shape2, it returns 
        //false because they have different shapeName and different numberofsides 

        System.out.println("shape2.equals(shape3) : " + shape2.equals(shape3));
        //checking the equality of the objects shape2 and shape3,  it returns 
        //true because they have same shapeName and same numberofsides 

        System.out.println("shape3==shape2 : " + (shape3 == shape2));
        //comparing two objects shape2 and shape3,they return true because they 
        //both are pointing to same reference object of shape2

        System.out.println("shape==shape1 : " + (shape == shape1));
        //comparing two objects shape and shape1,they return false because they
        //both are pointing to two different reference objects shape, shape1

        System.out.println("shape1==shape2 : " + (shape1 == shape2));
        //comparing two objects shape1 and shape2,they return false because they
        //both are pointing to two different reference objects shape1, shape2

        System.out.println("hashcode value of shape : " + shape.hashCode());
        //returns unique hashcode value of shape 

        System.out.println("hashcode value of shape1 : " + shape1.hashCode());
        //returns unique hashcode value of shape1

        System.out.println("hashcode value of shape2 : " + shape2.hashCode());
        //returns unique hashcde value of shape2

        System.out.println("hashcode value of shape3 : " + shape3.hashCode());
        //returns same hashcode value as of shape2, because the two objects 
        //shape2 and shape3 are equal

    }

}
