package Ejercicio06;

import java.awt.Event;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class EditorApp extends Frame{
    TextArea texto;
    MenuBar menubar;
    FileDialog abrirFichero;
    FileDialog guardarFichero;
    public static void main(String args[]){
        EditorApp app = new EditorApp();
    }
    public EditorApp(){
        super("Editor de textos");
        texto = new TextArea(25,50);
        this.add("Center", texto);
        this.pack();
        this.setSize(300,300);
        this.setVisible(true);
    }
    
    public void setup(){
        texto = new TextArea(25,50);
        this.add("Center", texto);
        setupMenuBar();
        abrirFichero = new FileDialog(this,"Abrir Fichero");
    }
    
    public void setupMenuBar(){
        menubar = new MenuBar();
        Menu archivoMenu = new Menu("Archivo");
        archivoMenu.add(new MenuItem("Nuevo"));
        archivoMenu.add(new MenuItem("Abrir..."));
        archivoMenu.addSeparator();
        archivoMenu.add(new MenuItem("Guardar..."));
        archivoMenu.addSeparator();
        archivoMenu.add(new MenuItem("Salir"));
        menubar.add(archivoMenu);
        this.setMenuBar(menubar);
    }
    
    public boolean handleEvent(Event ev){
        if (ev.id == Event.WINDOW_DESTROY) {
            System.exit(0);
            return false;
        }else if(ev.id == Event.ACTION_EVENT){
            if(ev.target instanceof MenuItem){
                if(ev.arg.equals("Salir")){
                    System.exit(0);
                    return false;
                }
                else if(ev.arg.equals("Nuevo")){
                    texto.setText(" ");
                    return true;
                }else if(ev.arg.equals("Abrir...")){
                    abrirFichero.setVisible(true);
                    String inFile = abrirFichero.getDirectory()+abrirFichero.getFile();
                    this.abrirF(inFile);
                    
                    return true;
                }//para guardar-> writeBytes();
            }
        }
        return false;
    }
    public void abrirF(String inFile){
        DataInputStream inStream;
        try{
            inStream = new DataInputStream(new FileInputStream(inFile));   
            String frase = "";
            String linea = "";
            while((linea = inStream.readLine()) != null)
                frase += linea + "\n";
            texto.setText(frase);
        }catch(FileNotFoundException e){
        }catch(IOException e){};
    }
}
