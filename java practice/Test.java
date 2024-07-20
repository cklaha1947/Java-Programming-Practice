//Anonymous class using interface
interface Eatable{  
    void eat();  
   } 
public class Test {
    public static void main(String args[]){  
        Eatable e=new Eatable(){  
         public void eat(){System.out.println("nice fruits");}  
        };  
        e.eat();  
        }
    
}
