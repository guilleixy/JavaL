package Ejercicio04;

import java.util.Random;

public class Bombo {
    int bolas[];
    public static int numBolas = 48;
    Random aleatorio;
    
    public Bombo(){
        bolas = new int[numBolas];
        for(int i = 0; i < numBolas; i++){
            bolas[i] = i + 1;
        }
        
        // Inicializa la instancia de Random
        aleatorio = new Random();
    }
    
    public int sacarBola(){
        int numAleatorio = aleatorio.nextInt(numBolas);
        int devuelve = bolas[numAleatorio];
        bolas[numAleatorio] = bolas[numBolas-1];
        numBolas--;
        return devuelve;
    }
}
