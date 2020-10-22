package com.company;

public class ClasePrincipal {
    public ClasePrincipal(){
        System.out.println("Empiezo");
        Hilo1 h1= new Hilo1();
        h1.start();
        Hilo2 h2= new Hilo2(h1);
        h2.start();
    }
}
