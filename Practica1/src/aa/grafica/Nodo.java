//Creo que puedo dispensar de esta clase pq puedo usar una lista de enteros en vez de objetos de la clase Nodo

package aa.grafica;

public class Nodo{
/*----------- Atributos de la clase Nodo ------------------------- */
    protected int valor;
    //protected Nodo<E> vecino;

    public Nodo(int valor){
        setValor(valor);
    }

/**---------- Getters y Setters ------------------------- */
    public void setValor(int valor){
        this.dato = valor;
    }

    public void getValor(){
        return this.valor;
    }

}