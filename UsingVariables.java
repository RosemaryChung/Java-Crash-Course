/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usingvariables;

import javax.swing.JOptionPane;

/**
 *
 * @author rosy
 */
public class UsingVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              String fullName;
        double hoursWorked;
        double payRatePerHour;
        double bonusPay;
        double grossPay;
        double netPay;
        double tax;
        String surname;
        
        
        
        fullName=JOptionPane.showInputDialog("What is your name?");
        surname=fullName.substring(fullName.indexOf(" "+1));
        hoursWorked=Double.parseDouble(JOptionPane.showInputDialog("How many hours worked?"));
        payRatePerHour=Double.parseDouble(JOptionPane.showInputDialog("What is the given pay rate per hour?"));
        
        bonusPay=(hoursWorked/5)*(1/2);
        grossPay=(hoursWorked*payRatePerHour)+bonusPay;
         if(grossPay>10000)
        {
            tax=grossPay/2;
        }
        tax=(14/100)*grossPay;
        netPay=grossPay-tax;
        
       
        
    System.out.println("My name is" + fullName.charAt(0) + "." + surname + "\n"
        + "Hours worked = " + hoursWorked + "\n"
        +"Rate per hour = " + payRatePerHour + "\n"
        +"Bonus = " + bonusPay + "\n"
        + "Gross pay = " + grossPay + "\n"
            +"Tax = " + tax + "\n"
        + "Net pay = " + netPay);
        
    }
    
}
