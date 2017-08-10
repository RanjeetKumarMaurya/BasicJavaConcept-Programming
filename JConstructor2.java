package javaprogram;

public class JConstructor2 {
    
    String e_name;
    int e_id;
    String e_add;
    
    JConstructor2(String e_name, int e_id, String e_add){  //it will print the default value of all variables
        this.e_name=e_name;
        this.e_id=e_id;
        this.e_add=e_add;
    }
    
    void show(){
        System.out.println("Emp name is :"+e_name);
        System.out.println("Emp id is :"+e_id);
        System.out.println("Emp address is :"+e_add);
    }
    public static void main(String[] args){
        JConstructor2 jc2= new JConstructor2("Ranjeet",1, "Kumar Building, Punjab");
        jc2.show();
    }
    
}
