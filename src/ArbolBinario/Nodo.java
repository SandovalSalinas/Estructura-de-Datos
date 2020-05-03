
package ArbolBinario;


public class Nodo {
    int dato;
    Nodo hijoD,hijoI;

    public Nodo(int d) {
        dato=d;
        hijoD=hijoI=null;
        
    }
    public String toString(){
        return "dato: "+ dato;
    }
    
    
    
    
}
