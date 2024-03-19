/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

/**
 *
 * @author guill
 */
public class Serpiente extends Animal{
    String tipo;
    double longitud;
    boolean venenosa;

    public Serpiente(String tipo, double longitud, boolean venenosa, int ID, String fnac, String procedencia, double peso, boolean vacunado) {
        super(ID, fnac, procedencia, peso, vacunado);
        this.tipo = tipo;
        this.longitud = longitud;
        this.venenosa = venenosa;
    }
    
    public void hablar(){
        System.out.println("Hola, soy una serpiente y mido " + this.longitud);
    }
    
}
