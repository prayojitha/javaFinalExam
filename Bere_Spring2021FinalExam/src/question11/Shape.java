/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;

import java.util.Objects;

/**
 *
 * @author keerthi prayojitha bere
 */
public class Shape {

    String shapeName;
    int numberOfSides;

    public Shape(String shapeName, int numberOfSides) {
        this.shapeName = shapeName;
        this.numberOfSides = numberOfSides;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    @Override
    public String toString() {
        return "Shape{" + "shapeName=" + shapeName + ", numberOfSides=" + numberOfSides + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.shapeName);
        hash = 19 * hash + this.numberOfSides;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Shape other = (Shape) obj;
        if (this.numberOfSides != other.numberOfSides) {
            return false;
        }
        if (!Objects.equals(this.shapeName, other.shapeName)) {
            return false;
        }
        return true;
    }

}
