package aa.grafica;
import java.util.*;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args){
        //Definimos las aristas de la grafica 
        List<Arista> puentes = Arrays.asList(new Arista(0,1), new Arista(0,2), new Arista(1,2), new Arista(2,0), new Arista(3,2), new Arista(4,5), new Arista(5,4));
        //Constructor de la grafica 
        Digrafica grafica = new Digrafica(puentes);

        //Imprimimos la grafica como lista de adyacencia 
        Digrafica.imprimeGrafica(grafica);
    }
}
