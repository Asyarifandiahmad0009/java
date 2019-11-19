/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access_Modifiers;

/**
 *
 * @author asy'ari
 */
public class Access_Modifiers_default {
     String name = "Asy'ari fandi ahmad";
  String name_p = "Asy'ari";
  String email = "asyarifandiahmad03@gmail.com";
  int umur = 20;
  
  public static void main(String[] args) {
    Access_Modifiers_default myObj = new Access_Modifiers_default();
    System.out.println("Name        : " + myObj.name + " " + myObj.name_p);
    System.out.println("Email       : " + myObj.email);
    System.out.println("Umur        : " + myObj.umur);
  }
}
