package Ejercicio11;

import java.awt.*;

public class Animacion1 extends Frame implements Runnable{
    Thread animacion;
    String frames[] = {"*", "**","***","****","*****","******","*****","****","***", "**","*"};
    public Animacion1(){
        super("Animacion sencilla");
        this.pack();
        this.setSize(200,200);
        this.setVisible(true);
        animacion = new Thread(this);
        animacion.start();
    }
    @Override
    public void run(){
        throw new UnsupportedOperationException("Not supported");
    }
}
