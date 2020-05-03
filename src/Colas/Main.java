
package Colas;


public class Main {

    
    public static void main(String[] args) {
     
        Cola c= new Cola();
        c.insert(1);
        c.insert(2);
        c.insert(3);
        c.insert(4);
        c.insert(5);
        c.delete();
        
        while(!c.empty()){
            System.out.println(c.delete());
    }
    }
    
}
