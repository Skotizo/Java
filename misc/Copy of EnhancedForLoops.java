public class EnhancedForLoops
{
     public static void main(String []args)
     {
        //Make an array of Strings
        String[] friends = {"Mark", "Steven", "Sam", "Billy"};
        
        //Loop through the friends array the old way
        for(int i = 0; i < friends.length; ++ i)
        {
            String friend = friends[i];
            System.out.println(friend);
        }
        
        //Loop using an Enhanced For Loop
        for(String friend : friends)
        {
            System.out.println(friend);
        }
        
        //Array of double, wages of employees
        double[] wages = {9.25, 10.50, 11.00, 8.25};
        
        //Enhanced For Loop through the array wages, 
        //print out everyones pay increased by $2.
        for(double wage : wages)
        {
            System.out.println((wage + 2));
        }
        
        
        
     }
}