
package simplepractice;

/**
 *
 * @author rosy
 */
public class SimplePractice {

   
    public static void main(String[] args) {
             //run the code then try these for yourself with different names for the variables
        int cat=4;            //"int cat" means there is an integer called cat
        int corn=5;            //same thing as above^ applies here
        System.out.println(cat+corn);        //the code outputs the sum of the two numbers, 4 and 5 (these numbers were declared (named) cat and corn)
        
        String name=JOptionPane.showInputDialog("Enter your name"); //run the code and try figure out what this means
        System.out.println(name);

        double num1=2;
        double num2=9,44;
        System.out.println(num1+num2); //what do you notice different about a 'double' and an 'int'

        char initial=R;
        System.out.println("My initial is: " + initial); //copy this code and try it on your name
   
    }
    
}
