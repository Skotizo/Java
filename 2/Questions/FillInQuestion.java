package Questions;


//MAKE THIS CLASS EXTEND QUESTION......
public class FillInQuestion extends Question
{
	//Since the answer is a String, we do NOT
	//need a new instance variable here to track
	//the correct answer, just use the String
	//variable that is in Question.java
	private String text;
	
	//Make a default constructor here that calls
	//the constructor in Question.java
	//You will need to use the super() call.
	public FillInQuestion()
	{
		super();
	}
	
	//Override the display() method.
	//No input parameters need, nothing to return.
	//The text will be set like this:  "What goes up must
	//come _down_".  Where "down" is the answer.
	//We displaying the text, we need to strip out the answer
	//and replace in with ____________.  You will need to use
	//.indexOf("_").  There is also a .indexOf() method that
	//searches from a specific index, it is used to find the 2nd _ 
	//in the string. Call like this:  .indexOf("_", startPosition);
	
	public void display()
	{
		
	}
	@Override
	
	
	
	//Override the checkAnswer() method.
	//One input parameter representing the users answer. 
	//Return true if answer match (.equals)
	//false otherwise.
	//The text will be set like this:  "What goes up must
	//come _down_".  Where "down" is the answer.
	//We need to strip out the word "down" and check it against
	//response coming into the method. Use will use
	//.indexOf("_").  There is also a .indexOf() method that
	//searches from a specific index, it is used to find the 2nd _ 
	//in the string. Call like this:  .indexOf("_", startPosition);
	
	@Override

}

