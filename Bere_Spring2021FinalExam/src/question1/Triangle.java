/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author keerthi prayojitha bere
 */
public class Triangle extends Shape implements Polygon {

    private int s1, s2, s3;
    private double s, area;

    public Triangle(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;

    }

    @Override
    public void getArea() {
        s = (double) (s1 + s2 + s3) / 2;
        area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        System.out.println("Area: " + area);
    }

}
