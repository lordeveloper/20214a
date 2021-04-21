/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforijava1;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lorenzo Melchiorre
 */
public class Gestore {

    private Semaphore semaphore;

    public Gestore() {
        semaphore =  new Semaphore(1);//commento locale
        semaphore =  new Semaphore(1);//commento
    }

    
    public void waitSemaforo() {
        try {
            semaphore.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Gestore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void signalSemaforo() {
        semaphore.release();
    }

    public int availablePermitsSemaforo() {
        return semaphore.availablePermits();
    }

}
