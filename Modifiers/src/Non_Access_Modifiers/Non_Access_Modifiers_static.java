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
public class Non_Access_Modifiers_static {
     // Static method
  static void myStaticMethod() {
    System.out.println("Metode statis dapat dipanggil tanpa membuat objek");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Metode publik harus dipanggil dengan membuat objek");
  }

  // Main method
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

   Non_Access_Modifiers_static myObj = new Non_Access_Modifiers_static(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
}
