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
public class Access_Modifiers_protected {
  protected String fname = "Asy'ari fandi ahmad";
  protected String lname = "Asy'ari";
  protected String email = "asyarifandiahmad03@gmail.com";
  protected int age = 20;
}

class Student extends Access_Modifiers_protected {
  private int graduationYear = 2018;
  public static void main(String[] args) {
    Student myObj = new Student();
    System.out.println("Name            : " + myObj.fname + " " + myObj.lname);
    System.out.println("Email           : " + myObj.email);
    System.out.println("Age             : " + myObj.age);
    System.out.println("Graduation Year : " + myObj.graduationYear);
  }
}
