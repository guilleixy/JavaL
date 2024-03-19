/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio02;

/**
 *
 * @author guill
 */
//abstract -> de esa clase no se podrán instanciar objetos
public abstract class Animal {
   int ID;
   String fnac;
   String procedencia;
   double peso;
   boolean vacunado;

    public Animal(int ID, String fnac, String procedencia, double peso, boolean vacunado) {
        this.ID = ID;
        this.fnac = fnac;
        this.procedencia = procedencia;
        this.peso = peso;
        this.vacunado = vacunado;
    }
    abstract void hablar();
}
