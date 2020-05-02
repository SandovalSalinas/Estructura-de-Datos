
package Listas;


public class ListaEnlazadaDoble {
    NodoD primero,ultimo;
    int tam;
    
 public ListaEnlazadaDoble(){}
 
 public void Agregar(int dato){
     NodoD nuevo=new NodoD(dato);
     if(tam==0){
         primero=ultimo=nuevo;
         
     }else{
         nuevo.atras=ultimo;
         ultimo.adelante=nuevo;
         ultimo=nuevo;
     }
     tam++;
 }
 
 
 public boolean Eliminar(){
 if(tam>0){
    if(tam()==1){
   primero=null;
   ultimo=null;
    }else{
        ultimo.atras.adelante=null;
        ultimo=ultimo.adelante=null;
    }tam--;
 }
     return false;
 }
 
 
 
 public void AgregarInicio(int dato){
   NodoD nuevo=new NodoD(dato);
   if(tam==0){
       primero=nuevo;
       ultimo=nuevo;
   
   }else{
      nuevo.adelante=primero;
      primero.atras=nuevo;
      primero=nuevo;
      
   }
   tam++;
 
 }
 
 
  public boolean EliminarInicio(){

     if(tam>0){
         if(tam()==1){
             primero=null;
             ultimo=null;
         }else{
           primero.adelante.atras=null;
           primero=primero.adelante;
         }
     }
 
 return false;
 }
 
 
 
 public void VerLista(){
    NodoD nodov;
    nodov=primero;
    
   while(nodov!=null){
        System.out.println(nodov.dato);
        nodov=nodov.adelante;
        
    }
    
    
   } 

    private int tam() {
    return tam;
    }
    
    public boolean  vacio(){
        return tam()==0;
    
    }
    
}