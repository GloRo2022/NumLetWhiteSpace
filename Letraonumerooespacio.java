/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letraonumerooespacio;

/**
 *
 * @author FAMILIAGGG
 */
public class Letraonumerooespacio {

    /**
     * @param args the command line arguments
     */
  
        public static void main(String[] args) {
    String nombre = "Ana 1 2 3 4";
    for(int i=0; i < nombre.length(); i++) {
      if(Character.isLetter(nombre.charAt(i)) == true) {
        System.out.println(""+ nombre.charAt(i) + " es una letra");
      }else if (Character.isDigit(nombre.charAt(i)) == true){
        System.out.println("" + nombre.charAt(i) + " es un numero");
      }else if (Character.isWhitespace(nombre.charAt(i)) == true){
        System.out.println(""+ nombre.charAt(i) + "- Esto es un espacio");
      }
    }
  }
    }
    

