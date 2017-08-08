package javaprogram;

/*Variables are use to store the value
We can use these value wherever it is required*/

public class JavaVariables {

int a=10;  //instance variable
static int b=20;  //static variable
static int e;

void m1(){   
    //instance area
    String s="ram";  //local variable
    
    System.out.println("value of instance a :"+a);
    System.out.println("value of static b :"+JavaVariables.b); //calling of static variable inside instance area
    System.out.println("value of local d :"+s);
    
    int sum = a+JavaVariables.b;
    System.out.println("sum is :"+sum);
}

static void m2(){
    //static area
    int d=30;   //local variable
    
    //there is no default value for local variable
    /*int s;
    System.out.println(s);*/
    
    System.out.println(JavaVariables.e); //there will be a default value of instance variables
    
    JavaVariables jv= new JavaVariables();
    System.out.println("value of instance a :"+jv.a); //calling of instance variable inside a static area
    System.out.println("value of static b :"+b);
    System.out.println("value of local d :"+d);
}

public static void main(String[] args){  
    //main method is ststic area
    JavaVariables jv1= new JavaVariables();
    JavaVariables jv2= new JavaVariables();
    
    jv1.m1();
    jv2.m2();
    
    int sum2=0;
    sum2 = jv1.a+b;
    System.out.println("sum2 is :"+sum2);
    
}
}
