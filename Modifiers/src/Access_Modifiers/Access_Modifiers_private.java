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
public class Access_Modifiers_private {
    
 private String nama = "Asy'ari fandi ahmad";
  private String nama_p = "Asy'ari";
  private String email = "asyarifandiahmad03@gmail.com";
  private int umur = 20;
  
  public static void main(String[] args) {
    Access_Modifiers_private myObj = new Access_Modifiers_private();
    System.out.println("Nama            : " + myObj.nama );
    System.out.println ("Nama Panggilan : " + myObj.nama_p);
    System.out.println("Email           : " + myObj.email);
    System.out.println("Umur            : " + myObj.umur);
  }
    
}