public class Lista {
    // Referencia  a el node raiz o la cabeza de la lista.
    private Nodo head;
    private int tamanio;
 
    // constructor
    public Lista() {
        this.head = null;
        this.tamanio = 0;
    }
    public boolean listaVacia(){
        return head == null;
    }
    public int getTamanio(){
        return tamanio;
    }
     // Agrega el nodo al final de la lista.
    public void add(Object dato){
        Nodo nuevo = new Nodo(dato);
        if(head == null){
            head = nuevo;
        }else{
            Nodo aux = head;
            while(aux.getEnlace() != null ){
                aux = aux.getEnlace();
            }
            aux.setEnlace(nuevo);
            // System.out.println("me agregue");
            this.tamanio ++;
        }
    }
    public void listar(){
        if (!listaVacia()) {
            Nodo aux = head;
            int i = 0;
            while(aux != null){
                Persona aux2 = (Persona)aux.getDato();
                System.out.print(i + ".[ Nombre: " + aux2.getNombre() +" Matricula: " + aux2.getMatricula() + " Edad: "+ aux2.getEdad() +" ] ");
                aux = aux.getEnlace();
                i++;
            }
        }
    }
    public Nodo getHead(){
        return head;
    }

}
 