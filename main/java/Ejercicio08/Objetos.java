/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio08;
import java.awt.*;
/**
 *
 * @author guill
 */
public class Objetos {

    String opciones[] = {"Si", "No", "Quizás"};
    paneles[1][0].add(new MiChoice(opciones));
    
    String deportes[] = {"Atletismo", "Baloncesto", "Tenis", "Esgrima", "Balonmano", "Patinaje"};
    paneles[1][1].add(new MiLista(deportes, true));
    
    paneles[1][2].add(new MiCanvas());
    
    String coimdas[] = {"Patatas", "Cebollas", "Tomates", "Lechuga"};
    paneles[2][0].add(new MiCheckbox)
    
    //principal.add etc
    principal.add(paneles([1][0]));
    principal.add(paneles[1][1]);
    principal.add(paneles[1][2]);
    
class MiBoton extends Button{
    TextArea texto;
    public MiBoton(String titulo, TextArea t){
        super(titulo);
        texto = t;
    }
    public boolean action(Event ev, Objeto o){
        texto.setText(" ");
        return true;
    }
}
    
class MiChoice extends Choice{
    TextArea textaera;
    public MiChoice(String[]elementos, TextArea texto){
        super();
        for(int i = 0; i < elementos.length; i++){
            this.add(elementos[i]);
        }
        textarea = texto;
    }
    public boolean action(Event ev, Object c){
        textarea.setText(this.getSelectedItem());
        return true;
    }
}

class MiLista extends List{
    TextArea textaera;
    public MiLista(String[] elementos, TextArea texto){
        //boolean para permitir selección múltiple
        super(5, true);
        for(int i = 0; i < elementos.length; i++){
            this.add(elementos[i]);
        }
        this.add(elementos[i]);
        textarea = texto;
    }
    public boolean handleEvent(Event ev){
        if((ev.id == Event.LIST_SELECT) || (ev.id == Event.LIST_DESELECT)){
            String seleccionados[] = this.getSelectedItems();
            String seleccion = "";
            for(int i = 0; i < seleccionados.length; i++){
                seleccion += seleccionados[i] + "\n";
            }   
            texto.setText(seleccion);
        }
        return true;
    }
}

class MiCanvas extends Canvas{
    int posX = 20;
    int posY = 20;
    public MiCanvas(){
        super();
        this.setSize(75,75);
        this.setBackground(Color.YELLOW);
        this.setForeground(Color.RED);
        this.setVisible(true);
    }
    public void paint(Graphics g){
        g.fillRect(posX, posY, 5, 5);
    }
    //metodos de tratamiento de eventos de raton recibiran coordenadas
    public boolean mouseDown(Event e, int x, int y){
        posX = x;
        posY = y;
        repaint();
        return true;
    }
}

  class MiCheckboxGroup extends Panel{
      Checkbox checkboxes[];
      TextField resultado;
      public MiCheckBoxGroup(String elementos[]){
          super();
          this.setLayout(new GridLayout(elementos.length + 1, 1));
          checkboxes = new Checkbox[elementos.length];
          for(int i = 0; i < elementos.length; i++){
              checkboxes[i] = new Checkbox(elementos[i]);
              this.add(checkboxes[i]);
          }
          resultado = new TextField("", 15);
          this.add(resultado);
      }
  }

}
