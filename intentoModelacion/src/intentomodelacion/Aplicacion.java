/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intentomodelacion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class Aplicacion {
    
    private  ArrayList<Nodo> G = new ArrayList<Nodo>(); //ESTA LISTA REPRESENTA EL GRAFO
    private  int cont = 1;
    private  Scanner sc = new Scanner(System.in);
    
    public  void AñadirVertice(){
     
        Nodo n = new Nodo(cont);
        cont++;
        this.G.add(n); //SE AÑADE EL NUEVO VERTICE CREADO
        System.out.println("Vertice añadido");
    }
    
    public  void MostrarVertice(){
        
        for (int i = 0; i < G.size(); i++) {
            System.out.print("V"+G.get(i).getId()+" ");
        }
        
        System.out.println("");
        System.out.println("");
    }
    
    public void ConectarVertice(){
        
        System.out.println("Escriba el indicie del nodo cabeza de la arista");
        int cabeza = sc.nextInt();
        System.out.println("Escriba el indice del nodo cola de la arista");
        int cola = sc.nextInt();
        
        if(Buscar(G,cabeza) && Buscar(G,cola)){
            
            AsignarVertice(G,cabeza,cola);
            AsignarVertice(G,cola,cabeza);
            System.out.println("Se relaciono V"+cabeza+" con V"+cola);
        }
        else{
            System.out.println("Uno de los 2 vertices no esta presente en el grafo");
        }
        
    }
    
    public boolean Buscar(ArrayList<Nodo> lista, int id){
        
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getId() == id){
                return true;
            }
        }
        
        return false;
       
    }
    
    public void AsignarVertice(ArrayList<Nodo> lista, int id1, int id2){
        
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getId() == id1){
                lista.get(i).getConjunto().add(new Nodo(id2)); //SE RELACIONA UN NODO CON OTRO
            }
        }
    }
    
    public void MayorCardinalidad(){
        
        int mayor = 0;
        
        for (int i = 0; i < G.size(); i++) {
        
            //SE ITERA CADA NODO DEL GRAFO Y SE DETERMINA QUE NODO NO ESTA PRESENTE EN SU CONJUNTO DE ADYACENCIA
            //LOS NODOS QUE NO ESTAN PRESENTES EN EL CONJUNTO DE ADYACENCIA VAN AL CONJUNTO ESTABLE DE CADA NODO
            for (int j = 1; j <= cont; j++) {
                
                if(!Buscar(G.get(i).getConjunto(),j)){
                    
                    G.get(i).getEstable().add(new Nodo(j)); //SE AÑADE UN NODO AL CONJUNTO ESTABLE
                }
            }
            
            //SE VALIDA SI ESE NODO TIENE EL MAYOR CARDINAL DEL CONJUNTO ESTABLE DE TODO EL GRAFO
            if(G.get(i).getEstable().size() > mayor){
                mayor = G.get(i).getEstable().size(); 
            }
            
        }
        
        System.out.println("El mayor cardinal es "+(mayor-1));
    }
    
    public Aplicacion(){
        
        int rsp = 0;
        
        while(true){
          
            System.out.println("Escriba la opcion deseada");
            System.out.println("(1) Ingresar Vertice");
            System.out.println("(2) Mostrar grafo");
            System.out.println("(3) Conectar nodos");
            System.out.println("(4) Determinar mayor cardinal conjuntos estables");
            System.out.println("(5) Salir");
            
            rsp = sc.nextInt();
            
            switch(rsp){
                
                case 1:
                    AñadirVertice();
                    break;
                case 2:
                    MostrarVertice();
                    break;
                case 3:
                    ConectarVertice();
                    break;
                case 4:
                    MayorCardinalidad();
                    break;
                case 5:
                    System.exit(0);
            }
            
        }
        
        
    }
    
}
