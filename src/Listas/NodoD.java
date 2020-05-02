
package Listas;

public class NodoD {
    int dato;
    NodoD adelante;
    NodoD atras;

    public NodoD(int d){
    dato=d;
    adelante=atras=null;
    }

    public int getDato(){
    return dato;
    
    }


}
