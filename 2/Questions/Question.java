package Questions;

public class Question
{
	/*
	 * Create instance variables to track
	 * question text and the correct answer.
	 */
	
	private String text;
	private String answer;
	
   /**
      Constructs a question.
      Set instance variables equal to ""
   */
   public Question() 
   {
	   text = "";
	   answer = "";
   }
   
   /**
      Sets the question text.
      @param questionText the text of this question
   */
   public void setText(String question)
   {
	   text = question;
   }
   
   public String getText()
   {
	   return text;
   }
   

   /**
      Sets the answer for this question.
      @param correctResponse the answer
   */
   public void setAnswer(String Answer)
   {
	   answer = Answer;
   }

   public String getAnswer()
   {
	   return answer;
   }

   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   
   public boolean checkAnswer(String response)
   {
	   if(answer.equalsIgnoreCase(response))
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
   }


   /**
      Displays this question.
   */
   public void display()
   {
	   System.out.println(text);
   }

}

