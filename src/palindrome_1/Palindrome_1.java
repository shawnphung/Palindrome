/*
 * Shawn Phung
 * Feb 24, 2020
 * The program determines whether the user input is a palindrome or not
 */

package palindrome_1;
import javax.swing.JOptionPane;
/**
 *
 * @author shphu0697
 */
public class Palindrome_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prompts user with input
        String input = JOptionPane.showInputDialog("Enter a word");
        //Sets up a String for the reverse
        String reverse = "";  
        //Determines the legnth of the input
        int length = input.length();
        
        for (int i = length - 1; i >= 0; i--){
            //The reverse String starts comparing at the end of the input String
            //Loops on for how every long the String input is, and 
            reverse = reverse + input.charAt(i);
            }
        //Output is determined on whether the input is a palindrome or not
        if (reverse.equals (input)){
            System.out.println("The reverse of " + input + " is " + reverse);
            System.out.println("The input is a palindrome");
        }else{
            System.out.println("The reverse of " + input + " is " + reverse);
            System.out.println("The input is NOT a palindrome");
        }
    }
    }
    

