/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforijava1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lorenzo Melchiorre
 */
public class MyThread extends Thread {

    private Gestore gestore;
    private String name;//posso utilizzare anche l'attributo ereditato per il nome

    public MyThread(String name, Gestore gestore) {
        this.name = name;
        this.gestore = gestore;
    }

    public void run() {


            System.out.println(name + " : acquiring lock...available Semaphore permits now: "
                    + gestore.availablePermitsSemaforo());

            gestore.waitSemaforo();
            System.out.println(name + " : got the permit!");

            try {

                for (int i = 1; i <= 5; i++) {

                    System.out.println(name + " : is performing operation " + i
                            + ", available Semaphore permits : "
                            + gestore.availablePermitsSemaforo());

                    // sleep 1 second
                    Thread.sleep(1000);

                }
            } catch (InterruptedException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }finally {

                // calling release() after a successful acquire()
                System.out.println(name + " : releasing lock...");
                gestore.signalSemaforo();

            }



    }

}
