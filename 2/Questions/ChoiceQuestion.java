package Questions;


import java.util.ArrayList;

//MAKE THIS CLASS EXTEND QUESTION......
public class ChoiceQuestion extends Question
{
	/*
	 * Add instance variable to track MC answers
	 */
	private ArrayList<String> choices;
	
	
	public ChoiceQuestion()
	{
		//Call the default constructor in Question.java
		super();
		choices = new ArrayList<String>();
		
	}
	
	/**
    	Adds an answer the list of possible answers
    	@param answer String
    	@param boolean that tracks if this is correct answer
    	@return nothing
	*/
	public void addAnswer(String answer, boolean isCorrect)
	{
		choices.add(answer);
		if(isCorrect == true)
		{
			super.setAnswer(answer);
		}
		
	}
	
	/**
		Display the question text (call the method in the super class)
		Then loop through the ArrayList and display each answer choice.
		NOTE:  We are overwriting the display() method in the super class.
		This method will be run instead of the one in the super class.
		@return nothing
	 */
   public void display()
   {
	   super.display();
	   for(String choice : choices)
	   {
		   System.out.println(choice);
	   }

   }
}
