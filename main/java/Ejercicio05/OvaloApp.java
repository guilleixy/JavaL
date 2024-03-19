/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio05;


import java.awt.Button;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;

public class OvaloApp extends Frame {
    Ovalo ovalo;
    public static void main(String[] args) {
        OvaloApp app = new OvaloApp();
    }

    public OvaloApp() {
        super("Dibujando óvalos");

        Button boton1 = new Button("Siguiente");
        Button boton2 = new Button("Salir");
        Panel panel = new Panel();
        ovalo = new Ovalo();
        panel.add("South", boton1);
        panel.add("South", boton2);
        this.add("South", panel);
        this.pack();
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics g){
        ovalo.dibujar(g);
    }
    
    public boolean handleEvent(Event ev) {
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return false;
        }else if(ev.id == Event.ACTION_EVENT){
            if(ev.target instanceof Button){
                if(ev.arg.equals("Salir")){
                    System.exit(0);
                    return true;
                }else if(ev.arg.equals("Siguiente")){
                    ovalo.update();
                    repaint();
                    return true;
                }
            }
        }
        return false;
    }

}