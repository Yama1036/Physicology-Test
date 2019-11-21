/*
 * Yama
 * 20/11/2019
 * This is psychology test.
 */

package psychologytest;

import java.util.Scanner;

/**
 *
 * @author ayyam8774
 */
public class PsychologyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);
        
        int choice = 0;
        int ans;
        
        while ( choice != 4 )
        {
            System.out.println(" Wellcome to Psychology Test!! ");
            System.out.println("");
        
            System.out.println("Please enter your choice.");
            System.out.println("");
            System.out.println("1 →【Question1】");
            System.out.println("2 →【Question2】");
            System.out.println("3 →【Question3】");
            System.out.println("4 →【Exit】");
            System.out.println("Please enter your choice.");
        
            choice = keyedInput.nextInt();
            
            if ( choice == 1 ) 
                {
                    System.out.println("【Question1】");
                    System.out.println("There is a cage. Inside of that cage, there is a lion. Who is the person in each position?");
                    System.out.println("");
                    System.out.println("1. A person whose  riding at lion");
                    System.out.println("");
                    System.out.println("2. A person in a lion's cage");
                    System.out.println("");
                    System.out.println("3. A person watching from outside");
                    System.out.println("T");
                    System.out.println("i");
                    System.out.println("m");
                    System.out.println("e");
                    System.out.println("");
                    System.out.println("T");
                    System.out.println("o");
                    System.out.println("");
                    System.out.println("T");
                    System.out.println("h");
                    System.out.println("i");
                    System.out.println("n");
                    System.out.println("k");
                    
                    System.out.println("");
                    System.out.println("");
                    
                    System.out.println("Enter 0 to ↓ show Result.");
                    
                    ans = keyedInput.nextInt();
                    
                    if ( ans == 0)
                    {
                        System.out.println("");
                        System.out.println("");
                        System.out.println("---Result---");
                        System.out.println("");
                        System.out.println("1. A person whose  riding at lion");
                        System.out.println("You are \"Respecting\" that person because you are riding a ferocious and strong one like a lion.");
                        System.out.println("");
                        System.out.println("2. A person in a lion's cage");
                        System.out.println("You \"hate\" this person because that person is in a position where the lion can eat it.");
                        System.out.println("");
                        System.out.println("3. A person watching from outside");
                        System.out.println("You think that person who is looking at cage is the same position as you. So, you \" don't care \" that person.");
                        System.out.println("");
                        System.out.println("--------------------------------------------------------------------");
                    }
                    
                
                }
            
            
            if ( choice == 2 )
                {
                    System.out.println("【Question2】");
                    System.out.println("You are swimming in the pool and trying to climb to the deck. Then someone who is watching you. Where did that person look at you?");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("T");
                    System.out.println("i");
                    System.out.println("m");
                    System.out.println("e");
                    System.out.println("");
                    System.out.println("T");
                    System.out.println("o");
                    System.out.println("");
                    System.out.println("T");
                    System.out.println("h");
                    System.out.println("i");
                    System.out.println("n");
                    System.out.println("k");
                    
                    System.out.println("Enter 0 to ↓ show Result.");
                    
                    ans = keyedInput.nextInt();
                    
                    if ( ans == 0)
                    {
                        System.out.println("");
                        System.out.println("");
                        System.out.println("---Result---");
                        System.out.println("");
                        System.out.println("That place is where you care most.");
                        System.out.println("");
                        System.out.println("--------------------------------------------------------------------");
                    }
                    
                
                }
            
            
            if ( choice == 3 )
                {
                    System.out.println("【Question3】");
                    System.out.println("When you were walking down the road, you met three kinds of animals. List the types of animals and their personality in the order they are encountered.");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("T");
                    System.out.println("i");
                    System.out.println("m");
                    System.out.println("e");
                    System.out.println("");
                    System.out.println("T");
                    System.out.println("o");
                    System.out.println("");
                    System.out.println("T");
                    System.out.println("h");
                    System.out.println("i");
                    System.out.println("n");
                    System.out.println("k");
                    
                    
                    System.out.println("Enter 0 to ↓ show Result.");
                    
                    ans = keyedInput.nextInt();
                    
                    if ( ans == 0)
                    {
                        System.out.println("");
                        System.out.println("");
                        System.out.println("---Result---");
                        System.out.println("");
                        System.out.println("That place is where you care most.");
                        System.out.println("");
                        System.out.println("--------------------------------------------------------------------");
                    }
                    
                
                }
        }    
        
            if ( choice == 4 )
                {
                    System.out.println("　　　∧∧\n" +
                    "　　（*･ω･） 　Thank you\n" +
                    "　 ＿|　⊃／(＿＿_\n" +
                    "／　└-(＿＿＿_／\n" +
                    "￣￣￣￣￣￣￣\n" +
                    "");
                }
        
        
        
    }
    
}

