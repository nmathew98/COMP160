/** 
 * Lab 3, COMP160, 2018
 */

// Part 2
// nextLine()
// Description: Advances this scanner past the current line and returns the input that was skipped. This method returns the rest of the current line, excluding any line separator at the end. The position is set to the beginning of the next line.
//              Since this method continues to search through the input looking for a line separator, it may buffer all of the input searching for the line to skip if no line separators are present.'
// Return: the line that was skipped
// nextInt()
// Description: Scans the next token of the input as an int.
//              An invocation of this method of the form nextInt() behaves in exactly the same way as the invocation nextInt(radix), where radix is the default radix of this scanner.
// Return: the int scanned from the input


// 1. Methods: main, jobOffer
//    Data fields: yours, sign
//    Local variables: junior, intermediate, senior

// 2. No output because jobOffer() is not called

// 8.
import java.util.Scanner;

public class Letter{
    private static String yours = "Yours sincerely";
    private static String sign = "Mr Albert Agnew Esq.\nHuman Resources Manager\nButtery Baps Unlimited\nwww.bb.co.nz";
    
    public static void main(String [] args){
        // 9.
        String name; // Name of applicant
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the successful applicant's name");
        name = scan.nextLine(); // Initialize name with input
        
        int junior = 25000;     // standard pay rate for Junior employee
        int intermediate = 35000;  // standard pay rate for Intermediate employee
        int senior = 50000;    // standard pay rate for Senior employee
        
        // 3.
        jobOffer();
        
        // 5.
        jobOffer("Chief Cook");
        jobOffer("Assistant Cook");
        
        // 6.
        jobOffer("Head Dishwasher", senior);
        jobOffer("Assistant Dishwasher", intermediate);
        
        // 7.
        jobOffer("Line Cook", "Gordon Ramsay", junior);
        jobOffer("Line Cook", "Amy Schumer", junior);
        
        // 9.
        jobOffer("Manager", name, senior);
    } // end method
    
    /** displays a job offer for Bottle Washer at $25K */
    public static void jobOffer(){
        System.out.println("Dear applicant\nI wish to offer you the position of Bottle Washer.\nThe pay rate will be $25000 per annum.");
        signature();
    } // end method
    
    // 4.
    /** Displays a job offer. Takes a string describing the job title as input. */
    public static void jobOffer(String jobTitle) {
      System.out.println("Dear applicant\nI wish to offer you the position of " +
                         jobTitle + "\nThe pay rate will be $25000 per annum.");
      signature();
    }
    
    // 6.
    /** Displays a job offer. Takes a string describing the job title and an integer with the payRate as input*/
    public static void jobOffer(String jobTitle, int payRate) {
      System.out.println("Dear applicant\nI wish to offer you the position of " +
                         jobTitle + "\nThe pay rate will be " + payRate + " per annum.");
      signature();
    }
    
    // 7.
    /** Displays a job offer. Takes four inputs ( a string for the job title, a string applicants name, and an integer for the applicant's payrate) */
    public static void jobOffer(String jobTitle, String applicant, int payRate) {
      System.out.println("Dear " + applicant + "\nI wish to offer you the position of " +
                         jobTitle + "\nThe pay rate will be " + payRate + " per annum.");
      signature();
    }
    
    // 10.
    /** Displays the signature */
    public static void signature() {
      System.out.println(yours + "\n" + sign + "\n");
    }
} // end class