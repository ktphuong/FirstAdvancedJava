/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcsadvancedjava;

/**
 *
 * @author hv
 */
public class Rectangle extends Shape {

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double a;
    double b;

    @Override
    public double calArea() {
        return a * b;
    }

}
