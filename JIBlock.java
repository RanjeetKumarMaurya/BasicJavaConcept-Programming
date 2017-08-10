/* Area enclosed under {} are known as Instance block
    {
    -----logic
    }
*/

/*
1 It is used to write the logic and Intialize variables.
2 It will execute before Constructor
3 No of execution of instance block depend upon the no of object creation
4 If constructor is called inside another cons the the the execution of instance will 
depend only upon the no of object creation */

package javaprogram;


public class JIBlock {

JIBlock(){
    System.out.println("0-arg const is running");
}

JIBlock(int a){
    System.out.println("int-arg const is running");
}

JIBlock(float b){
    this(5);
    System.out.println("float-arg const is running");
}
    
        {
            System.out.println("I am a instance block and I will run according to object creation");
        }
    public static void main(String[] args){
        //only two time instance block will execute bcz no of object creation is 2
        JIBlock jb= new JIBlock();
        JIBlock jb2= new JIBlock(4.4f);
    }
}
