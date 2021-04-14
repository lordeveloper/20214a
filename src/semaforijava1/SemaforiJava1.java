/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforijava1;

public class SemaforiJava1 {

    public static void main(String[] args) {

        Gestore gestore = new Gestore();
        System.out.println("Total available Semaphore permits : "
                + gestore.availablePermitsSemaforo());

        MyThread t1 = new MyThread("A", gestore);
        t1.start();

        MyThread t2 = new MyThread("B", gestore);
        t2.start();

        MyThread t3 = new MyThread("C", gestore);
        t3.start();

        MyThread t4 = new MyThread("D", gestore);
        t4.start();

        MyThread t5 = new MyThread("E", gestore);
        t5.start();

        MyThread t6 = new MyThread("F", gestore);
        t6.start();

    }
}
