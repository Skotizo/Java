package Questions;

import java.util.Scanner;

public class Quiz extends Question
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		
		Question p = new Question();
		p.setText("Who owns the Timberwolves?");
		p.setAnswer("Glen Taylor");
		presentQuestion(p);
		
		NumericQuestion N = new NumericQuestion();
		N.setText("What is 3 + 6.04?");
		N.setAnswer("9.04");
		presentQuestion(N);
		
		ChoiceQuestion C = new ChoiceQuestion();
		C.setText("Which country was the inventor of java born in?");
		C.addAnswer("Australia" , false);
		C.addAnswer("Canada" , true);
		C.addAnswer("Denmark" , false);
		C.addAnswer("United States" , false);
		presentQuestion(C);
			
	}


		public static void presentQuestion(Question q)
		{
			Scanner in = new Scanner(System.in);
			q.display();
			System.out.print("Your Answer: ");
			String Response = in.nextLine();
			System.out.println(q.checkAnswer(Response));
		}
	
}
