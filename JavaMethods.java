package javaprogram;

/*Inside a class directly writting the business
logic is not right*/

class X{}
class Emp{}
class Y{}
class Student{}


public class JavaMethods {
    
    public void m1(int a){
        //instance method/area
        int b=10;
        int sum = a+b;
        System.out.println("sum is : "+sum);
    }
    
    public static void m2(int a){
        //static method/area
        int b=35;
        int mul= a*b;
        System.out.println("Multiplication is : "+mul);
    }
    
    
        void m3(X x, Emp e){
        System.out.println("object type method 3");
    }
    
    void m4(Y y, Student s){
        System.out.println("object type method 4");
    }
    
    public static void main(String args[]){
        //static area
        JavaMethods jm = new JavaMethods();
        jm.m1(45);  //calling of instance method by using object
        JavaMethods.m2(5765);  //direct calling of static method by using class name
        
        //calling of class type method
        X x1= new X();
        Emp e1= new Emp();
        jm.m3(x1, e1);
        
        Y y= new Y();
        Student s1 = new Student();
        jm.m4(y, s1);
    } 
}