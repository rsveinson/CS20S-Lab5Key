/********************************************************************
 * Programmer:    put your name here
 * Class:  CS20S
 *
 * Assignment: lab exercise 5 question 1
 *
 * Description: calculate club fees due based on age and length of membership
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;

public class clubDues {  // begin class
    
    public static void main(String[] args) {  // begin main
    
    // ********* declaration of constants **********
 
        final double OVERCHARGE = 19.95;     //  per month for 18 and over
        final double UNDERCHARGE = 11.95;    // per month for under 18
        
        final int OVERAGE = 18;              //  age threshold
        
    // ********** declaration of variables **********
        
        String strin;                // string data input from keyboard
        String strout;                // processed info string to be output
        String bannerOut;            // string to print banner to message dialogs

        String prompt;                // prompt for use in input dialogs

        String delim = "[ :]+";        // delimiter string for splitting input string
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        String name = "";              // member's name
        int age = 0;                // member's age
        int months = 0;             // months of membership
        double fees = 0;            // membership fees due

        // ********** Print output Banner **********

        bannerOut = "*******************************************" + nl;
        bannerOut += "Name:        programmer" + nl;
        bannerOut += "Class:        CS20S" + nl;
        bannerOut += "Assignment:    lab ex 5 q1" + nl;
        bannerOut += "*******************************************" + nl + nl;

        System.out.println(bannerOut);
        
        // ************************ get input **********************

        prompt = "Enter your name age and number of months you've been a member. \n";    
        strin = JOptionPane.showInputDialog(bannerOut + prompt);
        JOptionPane.showMessageDialog(null, "you entered\n" + strin);

        /* **********************************
         * split the input string into tokens
         * use the value in delim as the delimieter
         * uncomment the line to use it.
         ************************************/
        String[] tokens = strin.split(delim);
        
        try{       
            name = tokens[0];                       // get first token a save it to name
            age = Integer.parseInt(tokens[1]);      // put second token into age
            months =  Integer.parseInt(tokens[2]);  // third token to months
        } //end try
        catch(ArrayIndexOutOfBoundsException d){
            JOptionPane.showMessageDialog(null, "Incorrect input");
        } // end catch
        
    // ************************ processing ***************************

        if(age < OVERAGE){
            fees = months * UNDERCHARGE;        // fees for under 18 member
        } // end if overage
        else{
            fees = months * OVERCHARGE;        // fees for  18 or over member
        } // end else
        
    // ************************ print output ****************************
 
        strout = String.format("%-24s%-10s%-10s%-10s%s", "Name", "Age", "Months", "Fees", nl);
        strout += String.format("%-28s%-17d%-10d$%-10.2f", name, age, months, fees);
        
        JOptionPane.showMessageDialog(null, bannerOut + strout);
    
        // ******** closing message *********
        
        System.out.println("end of processing.");
    }  // end main
}  // end class
