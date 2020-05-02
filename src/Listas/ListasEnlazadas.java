
package Listas;


public class ListasEnlazadas {
   protected Nodo primero;
   
   public ListasEnlazadas(){
   primero=null;
   }
   public ListasEnlazadas AgregarInicio(int dato){
            Nodo nuevo;
            nuevo=new Nodo(dato);
            nuevo.ref=primero;
            primero=nuevo;
            return this;
    }   
   public void AgregarFinal(int dato){
    Nodo nuevoF;
   nuevoF=new Nodo(dato);
   nuevoF.ref=null;
   
   if(primero==null){
            primero=nuevoF;
            return;
        }
   
            Nodo tmp;
            for(tmp=primero;tmp.getRef()!=null;tmp=tmp.getRef());
                    tmp.setRef(nuevoF);
        
   
   }
 public Nodo  Buscar(int dato){
       Nodo nodob;
      for(nodob=primero;nodob!=null;nodob.getRef()) 
          if(dato==nodob.dato)
          return nodob;
      
      return null;
      
      }
       
   
   
   
   public void eliminar(int dato){
       boolean encontrado;
       Nodo actual,anterior;
       actual=primero;
       anterior=null;
       encontrado=false;
       
       while(actual!=null&&!encontrado){
           encontrado=(actual.dato==dato);
           if(!encontrado){
           anterior=actual;
           actual=actual.getRef();
           
           }
       }
       if(actual!=null){
       if(actual==primero){
            primero=actual.ref;
            }else{
       anterior.setRef(actual.ref);
            }
       }
   }
   
   
   public void verLista(){
   Nodo nodov;
   nodov=primero;
   while(nodov!=null){
       System.out.println(nodov.dato);
            nodov=nodov.ref;
         }
   }
}
