/********************************************************************
 * Programmer:    sveinson
 * Class:  CS20S
 *
 * Assignment: lab exercise 5 q 3
 *
 * Description: test to see if a number input from the keyboard
 *              is even or odd
 ***********************************************************************/

// import java libraries here as needed

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class EvenOrOdd {  // begin class

    public static void main(String[] args) {  // begin main

        // ********* declaration of constants **********

        final int TWO = 2;          // maybe not so neccessary but it can't hurt

        // ********** declaration of variables **********

        String strin;                // string data input from keyboard
        String strout;                // processed info string to be output
        String bannerOut;            // string to print banner to message dialogs

        String prompt;                // prompt for use in input dialogs

        String delim = "[ :]+";        // delimiter string for splitting input string
        String tabSpace = "      ";    // six spaces

        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        int n = 0;                  // number input from keyboard
        String result = "";         // string to hold result of odd/even test
        boolean isEven = false;     // odd/even flag

        Scanner scanner = new Scanner(System.in);

        // ********** Print output Banner **********

        bannerOut = "*******************************************" + nl;
        bannerOut += "Name:        sveinson" + nl;
        bannerOut += "Class:        CS20S" + nl;
        bannerOut += "Assignment:    Odd/Even If Else Example" + nl;
        bannerOut += "*******************************************" + nl + nl;

        System.out.println(bannerOut);

        // ************************ get input **********************

        prompt = "Enter an integer." + nl;  
        System.out.println(prompt);
        n = scanner.nextInt();
        System.out.println("You entered " + n + nl);

        /*strin = JOptionPane.showInputDialog(bannerOut + prompt);
        JOptionPane.showMessageDialog(null,"you entered: " + strin);

        try{
        n = Integer.parseInt(strin);      // convert input to integer
        } // end try
        catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "enter an integer.");
        } // end catch
         */

        // ************************ processing ***************************

        isEven = n % TWO == 0;      // set flag if n is even

        if(isEven){
            result = "Even";        // set result to even
        } // end n is even
        else{
            result = "Odd";         // set result to odd
        } // end result is odd

        /* this could also be done like this */
        // if(n % TWO == 0){
        // result = "Even";        // set result to even
        // } // end n is even
        // else{
        // result = "Odd";         // set result to odd
        // } // end result is odd

        // ************************ print output ****************************

        strout = n + " is " + result;
        JOptionPane.showMessageDialog(null, bannerOut + strout);
        System.out.println(strout + "\n");

        // ******** closing message *********

        System.out.println("end of processing.");
    }  // end main
}  // end class
