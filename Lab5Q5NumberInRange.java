/* *********************************
* Programmer:  Sveinson
* Class:       CS20S
*
* Assignment:  Lab5 Q5
*
* Description: get in int from the keyboard
*               if the number is in range
*               multily it by 2, if not 
*               square it
* ************************************* */
// **** import class libraries ****
import java.util.Scanner;
import java.text.NumberFormat;

public class Lab5Q5NumberInRange
{
    public static void main(String[] args){
    // **** constants ****
        
        // set lower and upper bounds
        final int LOW = 10;
        final int HIGH = 50;
    
    // **** variables ****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        int n = 0;          // number entered from the keyboard
        int result = 0;   // result of calculation
    // **** objects ****
    
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // **** output banner *****
    
        banner = "**************************" + nl;
        banner += "Programmer: Sveinson" + nl;
        banner += "Class: CS20S" + nl;
        banner += "Assignment: Lab5 Q5" + nl;
        banner += "**************************" + nl;
        
        System.out.println(banner);
    
    // **** get input ****
        prompt = "Enter a number between 10 and 50.";
        System.out.println(prompt);
        
        n = scanner.nextInt();
        
        System.out.println("You entered " + n);
    
    // **** processing ****
    
        result = 0;       // not a bad idea to 0 out the result variable
    
        if(n >= LOW && n <= HIGH){
           //System.out.println("in range");
           result = n *2;      // double n
        }// end if(in range)
        else{
           //System.out.println("not in range");
           result = n * n;      // square n
        }// end else(out of range
    
    // **** output ****
    
        if(n >= LOW && n <= HIGH){
           System.out.format("%4d * 2 = %4d%s", n, result, nl);
        }// end if(in range)
        else{
           System.out.format("%4d * %4d = %4d%s", n, n, result, nl);
           System.out.format("out");
        }// end else(out of rang
    
    // **** closing message ****
    
        System.out.println("end of program.");
    
    } // end of main
}
