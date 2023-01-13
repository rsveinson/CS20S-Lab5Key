 

/********************************************************************
 * Programmer:    sveinson
 * Class:  CS20S
 *
 * Assignment: Lab Ex 5 Q2
 *
 * Description:will convert the case of a letter entered from the keyboard
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;

public class caseConvert {  // begin class
    
    public static void main(String[] args) {  // begin main
    
    // ********* declaration of constants **********
    
        final int OFFSET = 'a' - 'A';           // the offset of upper and lowercas letters
    
    // ********** declaration of variables **********
    
        String strin;                // string data input from keyboard
        String strout;                // processed info string to be output
        String bannerOut;            // string to print banner to message dialogs
    
        String prompt;                // prompt for use in input dialogs
    
        String delim = "[ :]+";        // delimiter string for splitting input string
        String tabSpace = "      ";    // six spaces
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
    
         char letterIn;             // letter input from keyboard
         char letterOut;            // letter with converted case
      
        // ********** Print output Banner **********
    
        bannerOut = "*******************************************" + nl;
        bannerOut += "Name:        sveinson" + nl;
        bannerOut += "Class:        CS20S" + nl;
        bannerOut += "Assignment:    Lab ex 5 q2" + nl;
        bannerOut += "*******************************************" + nl + nl;
        
        System.out.println(bannerOut);
    
        // ************************ get input **********************
    
        prompt = "Enter a letter. \n";    
        prompt += "Either UPPERCASE or lowercasd\n";
    
        strin = JOptionPane.showInputDialog(bannerOut + prompt);
        JOptionPane.showMessageDialog(null, "you entered " + strin);
        System.out.println("you entered " + strin);
        letterIn = strin.charAt(0);         // get the first letter in the string
        
        // ************************ processing ***************************
    
        if(letterIn >= 'a' && letterIn <= 'z'){
            letterOut = (char) (letterIn - OFFSET);   // convert to uppercase
        } // end lower case letter conversion
        else{
            letterOut = (char)(letterIn +  OFFSET);         // convert to lower case
        } // end uppercase conversion
        
        // ************************ print output ****************************
    
        strout = "Original input: " + letterIn + "\n";
        strout += "Converted letter: " + letterOut;
        
        JOptionPane.showMessageDialog(null, bannerOut + strout);
        System.out.println(strout + "\n\n");
    
        // ******** closing message *********
    
        System.out.println("end of processing.");
    }  // end main
}  // end class
