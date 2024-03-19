
package Ejercicio03;

public class Nif {
    public int dni;
    public char letra;
    public static char tabla[] = {'T','R','W','A','G','M','Y','F','P','D','X',
        'B','N','J','Z','S','Q','V','H','L','C','K','E'};

    public Nif(int dni) {
        this.dni = dni;
        this.letra = tabla[dni % 23];
    }
    
    public Nif(int dni, char c) throws Exception{
        this.dni = dni;
        if(c != tabla[dni % 23]){
            this.letra = this.tabla[dni % 23];
            throw new Exception("La letra recibida no es la correcta");
        }else{
            letra = c;   
        }
    }
    
    public void mostrarNif(){
        System.out.print(this.dni + " " + this.letra);
    }
}
