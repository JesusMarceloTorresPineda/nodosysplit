public class Nodo {
    //Referencia al siguiente elemento o a NULL si es el ultimo
    private Nodo enlace;
    private Object dato;
    private Object valor;
    // Nodo constructor
    public Nodo(Object dato) {
        enlace = null;
        this.dato = dato;
    }
    // Constructor que incluye el siguiente nodo
    public Nodo(Object valor, Nodo referencia) {
        enlace = referencia;
        dato = valor;
    }

    public Object getDato() {
        return dato;
    }

    public Nodo getEnlace(){
        return enlace;
    }
    

    public void setEnlace(Nodo referencia){
        this.enlace = referencia;
    }
}
