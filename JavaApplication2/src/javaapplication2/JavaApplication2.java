/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author hv
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Test");
        Student st = new Student();
        st.name = "Hoa";
        st.id = "sv001";
        st.age = 18;
        System.out.println("Student's information: " + st.id + " - " 
                        + st.name + " - " + st.age);
        
        Student st1 = new Student();
        st1.setId("sv002");
        st1.setAge(19);
        st1.setName("Bình");
        
        System.out.println("Student's information: " + st1.getId() + " - " 
                        + st1.getName() + " - " + st1.getAge());
        
        
    }

}
