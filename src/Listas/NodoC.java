
package Listas;


public class NodoC {
    int dato;
    NodoC adelante;
    NodoC atras;
    
    public NodoC(){}
    public NodoC(int d){
    dato=d;
    adelante=atras=null;
    }
    public int getDato(){
    return dato;
    }
    
}
