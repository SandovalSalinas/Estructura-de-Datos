
package ArbolBinario;
//hi


public class Arbol {
    Nodo raiz;
    
    public Arbol(){
       raiz =null;
    }
    
    public void insertar(int dato){
        Nodo nuevo= new Nodo(dato);
        if(raiz==null){
            raiz=nuevo;
        }else{
            Nodo tmp=raiz;
            Nodo padre;
            while(true){
               padre=tmp;
               if(dato<tmp.dato){//Izquierda
                   tmp=tmp.hijoI;
                   if(tmp==null){
                       padre.hijoI=nuevo;
                       return;
                   }
               }else{//derecha
                   tmp=tmp.hijoD;
                   if(tmp==null){
                       padre.hijoD=nuevo;
                       return;
                   }
                 
               }
            }
        }
    }
    
    
    public boolean vacio(){
        return raiz==null;
        
    }
    
    public void ver(Nodo nodo){
        if(nodo!=null){
            ver(nodo.hijoI);
            System.out.println(nodo.dato);
            ver(nodo.hijoD);
        }
    }
    
}
