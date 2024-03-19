/*

 */
public class Programa {
    public static void main(String[] args){
        Persona pers1 = new Persona("Pepe", "Burgos", 1.92, "C/. de la Esperanza");
        Persona pers2 = new Persona("Ana", "Sevilla", 1.72, "C/. de Triana");        
        Persona pers3 = new Persona("Antonio", "Barcelona", 1.80, "C/. Las Ramblas");        
        
        pers2.mostrar();
        
        System.out.println();
        pers2.setDireccion("C/. la Agonía");
        
        pers2.mostrar();
        
    }
}
