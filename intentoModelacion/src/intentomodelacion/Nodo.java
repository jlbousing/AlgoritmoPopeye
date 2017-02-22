/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intentomodelacion;

import java.util.ArrayList;

/**
 *
 * @author Sony
 */
public class Nodo {
    
    private int id;
    private ArrayList<Nodo> conjunto;
    private ArrayList<Nodo> estable;

    public ArrayList<Nodo> getConjunto() {
        return conjunto;
    }

    public void setConjunto(ArrayList<Nodo> conjunto) {
        this.conjunto = conjunto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Nodo> getEstable() {
        return estable;
    }

    public void setEstable(ArrayList<Nodo> estable) {
        this.estable = estable;
    }
    
    
    public Nodo(int id){
        this.id = id;
        this.conjunto = new ArrayList<Nodo>();
        this.estable = new ArrayList<Nodo>();
    }
    
    public void AsignarNodo(Nodo nuevo){
        
       this.conjunto.add(nuevo); //SE CONECTA EL NODO CON OTRO NODO
    }
    
    
   
}
