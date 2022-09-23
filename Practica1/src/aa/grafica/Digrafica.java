package aa.grafica;

import java.util.*;
import java.io.*;

public class Digrafica{    
    List<List<Nodo>> ListaAdj = new ArrayList<>();          //Creamos la lista de adyacencias como un ArrayList
    
    /***
     * Constructor de la gráfica
     * @param aristas: Lista de aristas.
     */

    public Digrafica(List<Aristas> aristas){

        //Alocación de la memoria para una lista de adyacencia. Alocamos en cada nodo de la lista de adyacencia la lista correspondiente.
        for(int i = 0; i < aristas.size(); i++){       //Para cada elemento de la lista Arista
            ListaAdj.add(i, new ArrayList<>());
        }

        for(Arista arista: aristas) {
            ListaAdj.get(arista.getInicio()).add(new Nodo(arista.getFinal))); 
        }
    }

    /**
     * Método para imprimir la gráfica
     * @param grafica: Grafica a imprimir
     */
    
    public static void imprimeGrafica(Digrafica grafica){
            int vertice_fuente = 0;
            int tamano_lista = grafica.ListaAdj.size();
            
            System.out.println("Vértices de la gráfica:");
            while(vertice_fuente < tamano_lista){
                //Itera através de la lista de Adyacencia e imprime las aristas
                for(Nodo arista: grafica.ListaAdj.get(vertice_fuente)){
                    System.out.println("Vértice: " + vertice_fuente + "==>" arista.getDato());
                }
                System.out.println(); //Imprime una línea ?
                vertice_fuente++;
            }
    }

}  