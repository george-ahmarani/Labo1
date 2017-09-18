/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import aleatoire.Person;

/**
 *
 * @author George Ahmarani
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person name = new Person("John","Doe",24);
        
        System.out.println(name.getFirstName());
        
        System.out.println(name.getLastName());
        
        System.out.println(name.getAge());
        
        name.setFirstName("George");
        
        System.out.println(name.getFirstName());
    }
    
}
