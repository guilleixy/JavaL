/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelota;
import java.awt.*;

public class Pelota extends Rectangle {
    Color color;
    int velX, velY;
    public Pelota(){
        super((int)(Math.random()*200),(int)(Math.random()*200),0,0);
        int diametro = (int)(Math.random()*40)+10;
        this.width = this.height = diametro;
        color = new Color((int)(Math.random()*256), (int)(Math.random()*256),(int)(Math.random()*256));
        velX = (int)(Math.random()*5)+1;
        velY = (int)(Math.random()*5)+1;
    }
    public void dibujar(Graphics rr){
        rr.setColor(color);
        rr.fillOval(x, y, width, height);
    }
    public void actualizar(){
        x += velX;
        y += velY;
        if((x >= (300-width))|| (x <= 0)){
            velX = -velX;
        }
        if((y >= (300-height)) || (y <= 0)){
            velY = -velY;
        }
    }
}

