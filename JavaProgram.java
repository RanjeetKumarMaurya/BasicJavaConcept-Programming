/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprogram;
 
/**
 *
 * @author ranjeet
 */
public class JavaProgram {
  
	int i=1;

	void m1(){
		System.out.println(i);
                i++;
                m2();
	}
	void m2(){
		m1();
		System.out.println(i);	
}
    public static void main(String[] args) {
		JavaProgram p= new JavaProgram();
		p.m2();
        // TODO code application logic here
    }
    
}
