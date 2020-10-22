package com.company;

public class Hilo1 extends Thread{

    @Override
    public void run() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public double numeroAleatorio(){
        Double num= (Math.random()*(4-20))+20;
        return num;
    }
}
