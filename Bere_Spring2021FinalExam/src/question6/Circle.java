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
public class Circle {

    double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getDiameter() {
        if (radius < 0.0) {
            throw new IllegalArgumentException("Radius " + radius
                    + " cannot be negative");
        }
        return 2 * radius;
    }

    public double getArea() throws IllegalRadiusException {

        if (radius == 0.0) {
            throw new IllegalRadiusException("Radius " + radius + " cannot be equal to zero");
        }
        return 2 * radius * Math.PI;
    }
}
