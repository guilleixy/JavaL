package Ejercicio04;

public class Ejecutable {
    
    public static final int FILAS = 6;
    public static final int COLUMNAS = 8; 
    public static int resultado[][];
    public static Bombo bombo;        
    
    public static void main(String[]args){
        bombo = new Bombo();
        resultado = new int[FILAS][COLUMNAS];
        for(int i = 0; i < FILAS; i++){
            for(int j = 0; j < COLUMNAS; j++){
                resultado[i][j] = bombo.sacarBola();
            }
        }
        mostrarResultados();
    }
    public static void mostrarResultados(){
        for(int i = 0; i < FILAS; i++){
            for(int j = 0; j < COLUMNAS; j++){
                System.out.print(resultado[i][j] +" ");
            }
            System.out.println();
        }
    }
}
