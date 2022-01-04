# Project-Eliza
CMP 167 - Project #2

# In 1996 there was a program named ELIZA. 
It parodied a psychotherapist session, such that the user would type sentences and the program used those words to compose a question. Your project will be similar in concept.

# In order to complete this project we had to:
- Use the Scanner class to retrieve input from the user
- Manipulate Strings
- Work with Arrays
- Use loops for repetition
- If-Else for logical decision branching
- Use Classes and Methods

# Program Details and Requirements:
- Use the starter code to create your PromptBank and modify it to work with your project.
- Your project should have 2 classes or more. 1 class is the starter code PromptBank, the other is your program’s logic.
- The initial greeting should say “Hello, my name is Eliza. What is your name?
- The user should enter their name.
- Then the program should greet the user by name and prompt them for input related to the therapy session "Hello . Tell me what is on your mind today in 1 sentence.”
- When the user submits their sentence your program should read in the line
- It should use the 1st word and last word from that line to form another prompt to the user by plugging those words into a statement or question randomly selected from the relevant array.
- Create methods that work with the starter code to replace BLANK1 and BLANK2 with the words from the line
- If the sentence the user enters ends with a ‘?’, the program should prompt the user with a question built using the 1st word and last word of their line.
- If the sentence the user enters ends with a ‘!’, the program should prompt the user with a statement that starts with “WOW! Dramatic! ” followed by the rest of the statement built using the 1st word and last word of their line.
- If the sentence the user enters ends with a ‘.’ or any other character, the program should prompt the user with a statement built using the 1st word and last word of their line.
- This process should be repeated until the user types “EXIT” as a response When the user types “EXIT” the user should be asked if they want to run the session again.
- If they say yes, upper or lower case, run the program from the beginning”
- If they say no, upper or lower case, say “Goodbye, until next time”
- Some of the things you’ll need to do to get the Project to work:
- Initialize your arrays to the appropriate length.
- Modify the existing methods in the starter code to populate the arrays by following the code comments
- Create methods to replace BLANK1 and BLANK2 in the sentence trunk you got from the array

# Example:
ELIZA:    Hello, my name is Eliza. What is your name?
USER:     WonderWoman
ELIZA:    Hello, WonderWoman. Tell me what is on your mind today in 1 sentence.
USER: Today is Friday.
ELIZA: Today seems important to you, so does Friday. Please tell me more.
USER: Friday is a fantastic day.
ELIZA: Friday and day seem to be on your mind. Let's talk about it.
USER: Why do want me to talk about Friday?
ELIZA: Does Why bother you? How about Friday?
USER: No!
ELIZA: WOW! Dramatic! No and No seem to be on your mind. Let's talk about it.
USER: I want to talk about the project.
ELIZA: I seems important to you, so does project. Please tell me more.
USER: EXIT
ELIZA: Do you want to run the session again?
USER: No
ELIZA: Goodbye, until next time
