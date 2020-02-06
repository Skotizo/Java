package Questions;

import java.util.Scanner;

public class QuestionRunner
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      
      
      Question q = new Question();
      q.setText("Who was the inventor of Java?");
      q.setAnswer("James Gosling");      
      q.display();
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
      
      
      
      ChoiceQuestion cq = new ChoiceQuestion();
      cq.setText("What is the best cereal?");
      cq.addAnswer("Frosted Flakes", false);
      cq.addAnswer("Wheaties", true);
      cq.addAnswer("Lucky Charms", false);
      cq.display();
      response = in.nextLine();
      System.out.println(cq.checkAnswer(response));
      
      NumericQuestion nq = new NumericQuestion();
      nq.setText("What is 3 + 6.04?");
      nq.setAnswer(9.04);
      nq.display();
      double intResponse = in.nextDouble();
      System.out.println( nq.checkAnswer(intResponse));
      
      
   }
}