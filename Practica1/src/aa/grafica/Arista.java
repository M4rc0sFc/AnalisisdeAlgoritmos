package aa.grafica;

public class Arista{
    protected int inicio,final;
    
    //constructor de la clase
    public Arista(int inicio, int final){
        this.inicio = inicio;
        this.final = final;
    }

/*------------- Getters y Setters ----------- */
    public void setInicio(int inicio){
        this.inicio = inicio;
    }

    public void setFinal(int final){
        this.final = final;
    }

    public int getInicio(){
        return inicio;
    }

    public int getFinal(){
        return final;
    }
}