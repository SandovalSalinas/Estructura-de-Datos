
package Listas;


public class Nodo {
    int dato;
    Nodo ref;
    
    public Nodo(int d){
     dato=d;
     ref=null;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getRef() {
        return ref;
    }

   
    

    public void setRef(Nodo referencia) {
        this.ref=referencia;
    }
}
    
    

