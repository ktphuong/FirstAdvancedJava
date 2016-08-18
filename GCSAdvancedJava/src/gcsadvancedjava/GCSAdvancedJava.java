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
public class GCSAdvancedJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape[] shapeArr = {new Circle(10), new Rectangle(20, 20)};
        double sumArea = 0;
        for (Shape s : shapeArr) {
            sumArea += s.calArea();
        }
        System.out.println("Sum of Area: " + sumArea);

        Student st = new Student();
        st.setId("st001");
        st.setName("Steven");
        st.setAge(15);

        System.out.println("Student's information: " + st.getId() + " - "
                + st.getName() + " - " + st.getAge());

    }
}
