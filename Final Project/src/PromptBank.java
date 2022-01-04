public class PromptBank {

	String [] questions;
	String [] statements;
	
	public PromptBank(){
		questions = new String[6]; //initialize your array to the correct length to match your number of questions you populate it with
		statements = new String [6]; //initialize your array to the correct length to match your number of questions you populate it with
		
	//initialized arrays
	populateStatementsArray();
	populateQuestionsArray();
		
	}
	public void populateStatementsArray(){
		statements[0] = "Tell me more about BLANK1 and BLANK2";
		statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
		statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
		statements[3] = "I'm here for you. Talk to me about BLANK1 and BLANK2";
		statements[4] = "BLANK1 sure sounds like a problem. But BLANK2 seems quite manageable";
		statements[5] = "You need to tell me more about BLANK1 or at least give me some context about BLANK2";
		/*complete this method with your other statements using BLANK1 for word1
		 * and BLANK2 for word2 place holder 
		 */
	}
	public void populateQuestionsArray(){
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
		questions[3] = "Does BLANK1 anger you for some reason? What about BLANK2?";
		questions[4] = "Are BLANK1 and BLANK2 connected with each other?";
		questions[5] = "Is BLANK1 more triggering than BLANK2?";
		/*complete this method with your other questions using BLANK1 for word1
		 * and BLANK2 for word2 place holder 
		 */
		
	}
	
	public String getRandomStatementTrunk(){
		return statements[(int)(Math.random() * (5 - 0 + 1) + 0 )];
		//fill in the method so it randomly selects the statement template
		//from the statements array ... hint use Math.random() to get the random index
		//so you can replace BLANK1 and BLANK2 with the appropriate words
	}

	
	
	public String getRandomQuestionTrunk(){
		return questions[(int)(Math.random() * (5 - 0 + 1) + 0 )];
		//fill in the method so it randomly selects the question template
		//from the questions array ... hint use Math.random() to get the random index
		//so you can replace BLANK1 and BLANK2 with the appropriate words
	}

	
	
}
