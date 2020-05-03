
package Pilas;


public class Pila {
    private Nodo ultimo;
    int tam;
    
    
    public Pila(){
    ultimo=null;
    tam=0;
    
    }
    
    
    //Indica si la Pila esta vacia
    public boolean empty(){
        return ultimo ==null;
    }
    
    
    //Inserta un elemento en la pila
    public void push(int dato){
        Nodo nuevo=new Nodo(dato);
        nuevo.siguiente=ultimo;
        ultimo=nuevo;
        tam++;
    }
    
    
    //Saca un elemento de la Pila
    public int pop(){
        int tmp=ultimo.dato;
        ultimo=ultimo.siguiente;
        tam--;
        return tmp;
    }
    
    
    //Revisa el ultimo elemento de la Pila
    public int peek(){
        return ultimo.dato;
    }
    
    
    //Indica el tama:o de la Pila
    public int size(){
        return tam;
    }
    
    
    //Limpia la Pila
    public void clear(){
        
        while(!empty()){
            pop();
        }
    }
}
