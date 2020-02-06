package Questions;

//MAKE THIS CLASS EXTEND QUESTION......
public class NumericQuestion extends Question
{
	//Create an instance variable to track the correct answer,
	//Which is a double for NumericQuestion
	private double correctAnswer;

	
	//Make a default constructor here that calls
	//the constructor in Question.java
	//You will need to use the super() call.
	public NumericQuestion()
	{
		super();
		correctAnswer = 0;
	}
	
	//Make a method called setAnswer() that sets the 
	//correct answer instance variable.
	//Take in a double and set the instance variable you 
	//created earlier.
	public void setAnswer(double answerIn)
	{
		correctAnswer = answerIn;
	}

	//Make a method called checkAnswer that takes in 
	//a users answer.  Compare the input answer with the
	//answer in the instance variable.  If the answers differ
	//by less than 0.01, return true.  Otherwise return false.
	//Math.abs() will help here.
	public boolean checkAnswer(double Answerin)
	{
		if(Math.abs(correctAnswer - Answerin) <= 0.01)
		{
			return true;
		}
		return false;
	}
}
