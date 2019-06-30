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
            this.tamanio ++;
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
                System.out.print(i + ".[ Nombre:" + aux2.getNombre() +" Matricula:" + aux2.getMatricula() + " ] ");
                aux = aux.getEnlace();
                i++;
            }
        }
    }
    public Nodo getHead(){
        return head;
    }

    public Persona findById(String matricula){
        Persona alumno = null;
        if (!listaVacia()) {
            Nodo aux = head;
            while(aux != null){
                Persona aux2 = (Persona)aux.getDato();
                if(aux2.getMatricula().equals(matricula)){
                    alumno = aux2;
                    return alumno;
                }else{
                    aux = aux.getEnlace();
                }
            }
        }
            return alumno;
    }

}
 