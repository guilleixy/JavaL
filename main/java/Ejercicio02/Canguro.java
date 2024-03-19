/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

/**
 *
 * @author guill
 */
public class Canguro extends Animal{
    double salto;
    double velocidad;

    public Canguro(double salto, double velocidad, int ID, String fnac, String procedencia, double peso, boolean vacunado) {
        super(ID, fnac, procedencia, peso, vacunado);
        this.salto = salto;
        this.velocidad = velocidad;
    }
    
    public void hablar(){
        System.out.println("Hola, soy un canguro y salto " + this.salto);
    }
    
}
