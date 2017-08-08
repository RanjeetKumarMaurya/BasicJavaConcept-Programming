package javaprogram;
public class JavaMethods2 {

int x=198;
int y=48976;
public int sum(int x, int y){

    //priority will be provided to local varables first
    System.out.println("Local var sum is :"+x+y);
    System.out.println("Instance var sum is :"+this.x+this.y);  //to represent instance variable inside a method use this keyword
    return x+y;
}

public static int mult(int a, int b){
    System.out.println("Local var multiplication is :"+a*b);
    System.out.println("'this' keyword can not be use inside a static block");
    /*System.out.println(this.x*this.y);  //this keyword can not be use in static block */
    return a*b;
}

public static void main(String[] args){
JavaMethods2 jm2= new JavaMethods2();
jm2.sum(75975759, 8646486);
jm2.mult(7565,745648);

int z=jm2.mult(86,75);  //recomended way to call a method
System.out.println(z);
}
}