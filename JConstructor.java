package javaprogram;

/*Once we create a class in java each time we need an
object to call this --
Constructor is used to create an object*/

public class JConstructor {
 
    /*
    //Default constructor will be created automatically if there is no
    any constructor is declared inside the class
    
    class_name()
    {
    Empty implementation
    }
    */
    
    JConstructor(){ //user defined constructor
    System.out.println("O-arg constructo");
    }
    
    JConstructor(int a){
        this();
       // this(3);  //second time calling is not possible
        System.out.println("1-arg constructo");
    }
    
    JConstructor(float a){  //constructor overloading is supported
        
        this(5);   //way to call a constructor inside another constructor, remember 'this()' must be first statement 
        System.out.println("2-arg constructo");
    }
    
    
    public static void main(String[] args){
        JConstructor jc= new JConstructor(8.8f);  //firs way to call
        //new JConstructor(7.8f);  //second way to call
    }
}
