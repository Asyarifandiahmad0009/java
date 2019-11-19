/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Non_Access_Modifiers;

/**
 *
 * @author asy'ari
 */

    // abstract class
abstract class Non_Accesss_Modifiers_Abstract {
  public String fname = "Asy'ari fandi ahmad";
  public int age = 20;
  public abstract void study(); // abstract method 
}

// Subclass (inherit from Person)
class Student extends Non_Accesss_Modifiers_Abstract {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Belajar Sepanjang Hari");
  }
}



  class MyClass{
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Person)
    Student myObj = new Student(); 
    
    System.out.println("Name            : " + myObj.fname);
    System.out.println("Age             : " + myObj.age);
    System.out.println("Lulusan Tahun   : " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}

