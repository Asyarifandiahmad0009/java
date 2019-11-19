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
public class Access_Modifiers_public {
  public String name = "Asy'ari fandi ahmad";
  public String lname = "Asy'ari";
  public String email = "asyarifandiahmad03@gmail.com";
  public int umur = 20;

public static void main(String[] args) {
    Access_Modifiers_public myObj = new Access_Modifiers_public(); 
    System.out.println("Name    : " + myObj.name + " " + myObj.lname);
    System.out.println("Email   : " + myObj.email);
    System.out.println("Umur    : " + myObj.umur);
  }
}
