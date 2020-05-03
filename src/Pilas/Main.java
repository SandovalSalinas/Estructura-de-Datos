
package Pilas;

public class Main {
    
    public static void main(String[] args) {
        
        //Pila
      /*  Pila p =new Pila();
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.pop();
        p.pop();
        
        while(!p.empty()){
            System.out.println(p.pop());}
        */
      
       //Pila de Objetos
       
       PilaObjetos p=new PilaObjetos();
       p.push("Hola");
       p.push(1);
       p.push(true);
       p.push(2.2f);
       p.pop();
       
       while(!p.empty()){
           System.out.println(p.pop());
       }
      
        
    }
    
}
