/*

 */
public class Persona {
    private String nombre;
    String lugarNacimiento;
    double altura;
    String direccion;
    
    //el constructor en mayúscula!!!!
    public Persona(String nom, String lugarNacimiento, double altura, String direccion){
        nombre = nom;
        this.lugarNacimiento = lugarNacimiento;
        this.altura = altura;
        this.direccion = direccion;     
    }
    //polimorfismo
    public Persona(String nom, String lugarNacimiento){
        this(nom, lugarNacimiento, 0, "No lo sé");
    }
    
    
    public void mostrar(){
        System.out.printf("Hola, me llamo %s. Mido %.2f y vivo en %s", this.nombre, this.altura, this.direccion);
    }
    
    public void setDireccion(String nuevaDireccion){
        this.direccion = nuevaDireccion;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
}
