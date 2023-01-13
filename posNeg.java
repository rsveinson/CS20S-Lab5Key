/********************************************************************
 * Programmer:    sveinson
 * Class:  CS20S
 *
 * Assignment: Lab Ex 5 Q 4
 *
 * Description: test to see if a number is positive or not
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.util.Scanner;
 
public class posNeg {  // begin class
    
    public static void main(String[] args) {  // begin main
    
    // ********* declaration of constants **********
    
        // string constants to use for output
        // message about the status of the number
        final String ISPOSITIVE = " is positive.\n";
        final String ISNOTPOSITIVE = " is not positive.\n";
        
    // ********** declaration of variables **********
    
        String strin;                // string data input from keyboard
        String strout;                // processed info string to be output
        String bannerOut;            // string to print banner to message dialogs
        
        String prompt;                // prompt for use in input dialogs
        
        String delim = "[ :]+";        // delimiter string for splitting input string
        // a new line character that works on every computer system
        String nl = System.lineSeparator(); 
        
        int n = 0;                  // integer entered from keyboard
        boolean positive = false;     // positive of positive/negative test
            
        Scanner scanner = new Scanner(System.in);
        
    // ********** Print output Banner **********

        bannerOut = "*******************************************" + nl;
        bannerOut += "Name:        sveinson" + nl;
        bannerOut += "Class:        CS20S" + nl;
        bannerOut += "Assignment:    Positive/Negative If Else Example" + nl;
        bannerOut += "*******************************************" + nl + nl;
        
        System.out.println(bannerOut);
        
    // ************************ get input **********************

        prompt = "Enter an integer, either positive or negative."; 
        System.out.println(prompt);
        n = scanner.nextInt();
        System.out.println("You entered " + n + nl);
        
        /* the following lines will get the input from a JOptionPane
         * input window and use an exceptoin handling try catch block
         * to make sure that the input is correct
         */
        // strin = JOptionPane.showInputDialog(bannerOut + prompt);
        // JOptionPane.showMessageDialog(null,"you entered: " + strin);
        
        // try{
            // n = Integer.parseInt(strin);      // convert input to integer
        // } // end try
        // catch(NumberFormatException e){
            // JOptionPane.showMessageDialog(null, "input must be an integer.");
        //} // end catch
        
    // ************************ processing ***************************

        if(n >= 0){
            positive = true;          // set positive to ture, number is positive
        } // end n is positive
        else{
            positive = false;         // set positive ot false number isn't positive
        } // end else
        
    // ************************ print output ****************************
    /* I"ll print to both the console window and
     * a JOPtionPane message pop-up window
     */
    
        if(positive){
            JOptionPane.showMessageDialog(null, bannerOut + n + ISPOSITIVE);
            System.out.println(n + ISPOSITIVE);
        } // end positive
        else{
            JOptionPane.showMessageDialog(null, bannerOut + n + ISNOTPOSITIVE);
            System.out.println(n + ISNOTPOSITIVE);            
        } // end else
    
        // ******** closing message *********
        
        System.out.println("end of processing.");
    }  // end main
}  // end class
