
package Listas;

public class ListasEnlazadasDobleCircular {
    NodoC primero;
    NodoC ultimo;
    
    
    public ListasEnlazadasDobleCircular(){
    primero=ultimo=null;
    }
    
    
    public void Agregarr(int dato){
        NodoC nuevo=new NodoC(dato);
        if(primero==null){
        primero=nuevo;
        primero.adelante=primero;
        nuevo.atras=ultimo;
        ultimo=nuevo;
    }else{
            ultimo.adelante=nuevo;
            nuevo.adelante=primero;
            nuevo.atras=ultimo;
            ultimo=nuevo;
            primero.atras=ultimo;
        }
    }
    
    public void eliminar(int dato){
        NodoC actual=new NodoC();
        NodoC anterior=new NodoC();
        actual=primero;
        anterior=ultimo;
        do{
                if(actual.dato==dato){
                    if(actual==primero){
                        primero=primero.adelante;
                        ultimo.adelante=ultimo;
                        primero.atras=ultimo;
                    }else if(actual==ultimo){
                        ultimo=anterior;
                        primero.atras=ultimo;
                        ultimo.adelante=primero;
                        
                    }else{
                        anterior.adelante=actual.adelante;
                        actual.adelante.atras=anterior;
                    }
                }
                anterior=actual;
                actual=actual.adelante;
    }while(actual!=primero);
    
}  
    public void verr(){
     NodoC actual;
    actual=primero;
    do{
        System.out.println(actual.dato);
        actual=actual.adelante;
    }while(actual!=primero);
    
    }
    
}
