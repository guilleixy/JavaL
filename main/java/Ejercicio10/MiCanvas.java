/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;

/**
 *
 * @author guill
 */

import java.awt.*;

public class MiCanvas extends Canvas{
    DosPuntos obj1;
    public MiCanvas(){
        super();
    }
    public void paint(Graphics g){
        obj1.dibujar(g);
    }
    @Override
    public boolean mouseDown(Event ev, int xm int y){
    obj1 = new DosPuntos(x,y,tipo);
    return true;
    }
    @Override
    public boolean mouseDrag(Event ev, int x, int y){
        obj1.setFinX()
    }
}
