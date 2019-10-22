package constructors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MASTER-PC
 */
public class Constructors {
     long Nim;  // Create a class attribute
     String Nama;
  // Create a class constructor for the MyClass class
  public Constructors() {
    Nim = 201869040009L;  // Set the initial value for the class attribute x
    Nama = "Asy'ari fandi ahmad";
    
  }

  public static void main(String[] args) {
    Constructors myProfile = new Constructors(); // Create an object of class MyClass (This will call the constructor)
    System.out.println(myProfile.Nim+ " " + myProfile.Nama); // Print the value of x
  }
 
}
