package com.company;

public class Hilo2 extends Thread{
    Hilo1 h;
    public Hilo2(Hilo1 hilo1){h=hilo1;}

    @Override
    public void run() {
        try {
            long tiempoIn=System.currentTimeMillis();
            int num=(int)h.numeroAleatorio();
            for(int i=0;i<num;i++){
                sleep(2000);
            }
            System.out.println("Se ha repetido "+num);
            long tiempoOut=System.currentTimeMillis();
            long resul=tiempoOut-tiempoIn;
            System.out.println("He tardado "+resul+" en terminar");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
