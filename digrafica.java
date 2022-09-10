import java.util.*;
import java.io.*;

public class digrafica{    
    //Atributos
    int n,m;
    n = 2;  //Número de vértices 
    m = 3;  //Número de aristas 

    public ArrayList<ArrayList<Integer> adj;
    //public final boolean dirigida;

    public digrafica(int n){
        //this.dirigida = dirigida;
        this.adj = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<Integer>());
        }
    }

    /*
     * Método para añadir una arista
     * Este método se usa para construir una gráfica
     */
    
    public void añadeArista(int u, int v){
        this.adj.get(u).add(v);
    }

/*
 * Método para determinar si la gráfica contiene la arista o no.
 */

    public boolean contieneArista(int i, int j){
        return this.adj.get(i).contains(j);
    }

/**
 * Método para obtener el número total de vértices de la gráfica. ¿Realmente lo necesito?
 */

    public int cuentaVertices(){
        return this.adj.size();
    }

/*
 * 
 */
    


}