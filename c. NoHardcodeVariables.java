/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NoHardcode;

import javax.swing.JOptionPane;

/**
 *
 * @author rosy
 */
public class Stringstuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        
        String passw1;
        int passw2;
        char passw3;
        String passw4;
        String word2;
        word2= JOptionPane.showInputDialog("What is your word");
        
         passw1=word.substring(0,1);
                 passw1=passw1.toUpperCase();
                 
                 passw2=word.length();
                 passw3=word.charAt(4);
                 passw4=word.substring(passw2-3,passw2);
                 
                 word2=word.replaceAll("#"," " );
                 
                 System.out.println("Passwords=" + passw1 + passw2 + passw3 + 
                         passw4 + "\n" + "Original word:" + word2);
                 
                 
                 
                 
                 
         
        
        
        
        
    }
    
}
