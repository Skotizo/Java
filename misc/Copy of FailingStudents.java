
public class FailingStudents 
{
	public static void main(String[] args) 
	{
            double PASSING = 65.0;
            double[] percents = {53.2, 99.8, 55.8, 65.0, 65.8,
							 89.2, 83.2, 75.8, 64.9, 64.0,
							 73.2, 94.6, 99.2, 83.0, 75.8,
							 45.2, 82.8, 75.8, 68.0, 67.8,
							 57.2, 94.6, 95.4, 93.0, 83.8};
		
        for(double x: percents)
        {
            int a = 0;
            if(x < 65)
            {
                System.out.println(x);
                a++;
            }
            System.out.print("there is" +  a + " failing");
        }
        }
	
}
