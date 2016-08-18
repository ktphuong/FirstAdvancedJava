/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcsadvancedjava;

/**
 *
 * @author ktphuong
 */
public class Student {

    @Override
    public String toString() {
        return this.getId() + " - " + this.getName() + " - " + this.getAge();
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Student) obj).getName());
    }

    @Override
    public int hashCode() {
        int hash = 10;
        hash += this.getAge();
        return hash;
    }

    public Student() {
    }

    String id;
    String name;
    int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
