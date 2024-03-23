package assignment07;

public class Greeter 
{
     String name;
     
     public Greeter(String name)
     {
    	 this.name=name;
     }
     public void sayHello()
     {
    	 System.out.println("Hello"+this.name);
     }
     public void sayGoodbye()
     {
    	 System.out.println("Good Bye"+this.name);
     }

}
