//https://youtu.be/dxiezbKhcFk
import java.util.Scanner;
public class ProjectEliza {
	
	public static void main(String[] args) {
		

		Scanner scnr = new Scanner(System.in); 
		String userName; //We declare a string for the user 
		String userInput = ""; //We declare an string for the inputs 
		String first = "";
		String last = "";
		
		PromptBank promptBank = new PromptBank(); //we declare our prompt bank class
		
		//First print statement 
		System.out.println("Hello, my name is Eliza. What is your name?");//The programs greets the user
		System.out.print("User: ");
		userName = scnr.nextLine();
		System.out.println("Hello " + userName + ". Tell me what is on your mind today in 1 sentence.");
		userInput = scnr.nextLine();
		
   while (true) {

   if(userInput.equalsIgnoreCase("EXIT")) {//If the user types in exit the program will prompt the following print statemnent 
		System.out.println("Do you want to run the session again? Select Yes or No");
		userInput = scnr.nextLine();
		//yes or no if-statements 
		if (userInput.equalsIgnoreCase("NO")) {
			System.out.println("Goodbye, until next time");
			System.exit(0);
		} // end if
    else{
    if(userInput.equalsIgnoreCase("YES")) {  
   	System.out.println("Hello " + userName + ". Tell me what is on your mind today in 1 sentence.");
		userInput = scnr.nextLine();
    
     }// end if
    } // end else

   }// end if

	if(!userInput.equalsIgnoreCase("EXIT")) {
				
        String [] sentence = userInput.split(" ");
				
				if (sentence.length == 1) {
					first = sentence[0];
					last = sentence[0];
				}
				else {
					first = sentence[0];
					last = sentence[sentence.length - 1];
				}
    
				
		//if statements for special characters 
		if (userInput.contains("?")) {
		    System.out.println(promptBank.getRandomQuestionTrunk().replaceAll("BLANK1", first).replaceAll("BLANK2",last));
            userInput = scnr.nextLine();	 
		 }
		else {
		 
		if (userInput.contains("!")) {
			System.out.println("WOW! Dramatic! " + promptBank.getRandomStatementTrunk().replaceAll("BLANK1", first).replaceAll("BLANK2", last));
			userInput = scnr.nextLine();
		}
		else {
			System.out.println(promptBank.getRandomStatementTrunk().replaceAll("BLANK1", first).replaceAll("BLANK2", last));
			userInput = scnr.nextLine();
        			}// end else
				}// end else 
			}// end if
		} // end while
	}// end main
}// end class

