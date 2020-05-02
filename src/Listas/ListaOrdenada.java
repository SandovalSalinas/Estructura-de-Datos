
package Listas;


public class ListaOrdenada extends ListasEnlazadas{
    public ListaOrdenada(){
    super();
    }
    
    public ListaOrdenada insertarOrden(int dato){
    Nodo nuevo;
    nuevo=new Nodo(dato);
    if(primero==null)
        primero=nuevo;
    else if (dato<primero.getDato()){
      nuevo.setRef(primero);
      primero=nuevo;
    }
    else{
        Nodo anterior,primeroO;
      
      anterior=primeroO=primero;
      
      while((primeroO.getRef()!=null)&& dato>primero.getDato()){
          anterior=primeroO;
          primeroO=primeroO.getRef();
          
      }
      if(dato>primeroO.getDato())
          anterior=primeroO;
       
      nuevo.setRef(anterior.getRef());
      anterior.setRef(nuevo);
      
    }
    return this;
    }
    
    
}
