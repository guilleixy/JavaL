/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio05;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author guill
 */
public class Ovalo {
    int posX, posY, anchura, altura; 
    Color color;
    Random random;
    public Ovalo(){
        random = new Random();
        posX = random.nextInt(200);
        posY = random.nextInt(200);
        anchura = random.nextInt(100);
        altura = random.nextInt(100);
        color = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
    }
    public void dibujar(Graphics g){
        g.setColor(color);
        g.fillOval(posX, posY, anchura, altura);
    }
    
    public void update(){
    random = new Random();
    posX = random.nextInt(200);
    posY = random.nextInt(200);
    anchura = random.nextInt(100);
    altura = random.nextInt(100);
    color = new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
    }
    
}
