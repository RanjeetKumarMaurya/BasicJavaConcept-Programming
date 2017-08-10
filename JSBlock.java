/*static block execute first in class
1 static block is used to write logic and to instialize static variables
2 No of execution of static block is proportional to the .class file loading
3 main method is mendentory to run static block
4 class.forname("class_name"); is required to run the static block of
a class not having main method
*/

package javaprogram;


public class JSBlock {
    
    void m1(){
        System.out.println("Method will execute in last");
    }
    
    JSBlock(int a){
        System.out.println("const will execute before the method");
    }
    
    {
        System.out.println("instance block-1 will run when object will be created");
    }
    
    {
        System.out.println("instance block-2 will run when object will be created");
    }
    
    static{
        System.out.println("static block will run first during loading of .class file");
    }
    
    public static void main(String[] args){
        System.out.println("Main method is starting...");
        JSBlock jb=new JSBlock(56);
        jb.m1();
       // JSBlock.forname("Test1");
    }
}

class Test1{
    static{
        System.out.println("I am a static block of class Test1");
    }
}