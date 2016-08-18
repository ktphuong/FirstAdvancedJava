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
public class Circle extends Shape {

    public Circle(double r) {
        this.r = r;
    }

    double r;

    @Override
    public double calArea() {
        return Math.PI * Math.pow(r, 2);
    }

}
