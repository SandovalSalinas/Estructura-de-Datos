
package Colas;


public class Cola {
     Nodo primero,ultimo;
     int tam;
     
     public Cola(){
     primero=ultimo=null;
     tam=0;
     }
     
     public boolean empty(){
         return primero==null;
     }
     
     
     public void insert(int dato){
         Nodo nuevo=new Nodo(dato);
         if (empty()){
             primero=nuevo;
         }else{
             ultimo.siguiente=nuevo;
         }
         ultimo=nuevo;
         tam++;
     }
     
     
     public int delete(){
         int tmp=primero.dato;
         primero=primero.siguiente;
         tam--;
         return tmp;
     }
     
     
     public int inicio(){
         return primero.dato;
     }
     
     
     public int size(){
         return tam;
     
     }
    
}
