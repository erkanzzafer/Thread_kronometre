/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.thread_kronometre;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zafer
 */
public class KronometreThread implements Runnable {

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Oluşturuluyor: " + threadName);
    }

    @Override
    public void run() {
        System.out.println("çalıştırılıyor:" + threadName);

        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println(threadName + ": " + i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(KronometreThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void start() {
        System.out.println("Thread Nesnesi oluşuyor...");
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }

    }

}
