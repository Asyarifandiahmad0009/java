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
public class Non_Access_Modifiers_final {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    Non_Access_Modifiers_final myObj = new Non_Access_Modifiers_final();
    myObj.x = 50; // will generate an error: cannot assign a value to a final variable
    myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
