
package usingvariables;

import javax.swing.JOptionPane;

/**
 *
 * @author rosy
 */
public class UsingVariables {


    public static void main(String[] args) {
        // Remember: 'int' is an integer
        //            'double' is a real number
        //            'char' is a single character or space (if used with numbers, mathematical operations wont work
        //            'String' can be anything (numbers, letters, spaces, phrases).
        //NB: 1. Java is case sensitive, therefore CAPITAL LETTERS MATTER
        //    2. ALWAYS end with a semi-colon unless told

        
        //Declaring variables: this tells the code that the following variables or 'things' exist
              String fullName;
        double hoursWorked;
        double payRatePerHour;
        double bonusPay;
        double grossPay;
        double netPay;
        double tax;
        String surname;
        
        
        //'JOptionPane' is a way for the user of the code to input unique variables, test it out by running the code
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
