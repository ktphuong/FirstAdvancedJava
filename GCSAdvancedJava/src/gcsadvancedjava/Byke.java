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
final class Byke {

    final int speedlimit = 90;

    final void run() {
        System.out.println("running");
    }
}
// Dependency Inversion Principle - Good example

interface IWorker {

    public void work();
}

class Worker implements IWorker {

    public void work() {
        // ....working
    }
}

class SuperWorker implements IWorker {

    public void work() {
        //.... working much more
    }
}

class Manager {

    IWorker worker;

    public void setWorker(IWorker w) {
        worker = w;
    }

    public void manage() {
        worker.work();
    }
}
