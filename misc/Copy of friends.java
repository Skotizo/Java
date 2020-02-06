/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author unco
 */
public class friends
{
	public static void main(String[] args) 
	{
		String[] list1 = {"Bruce", "Peter", "Tony", "Clark", "Wade"};
		String[] list2 = {"Tony", "Matt", "Maggie", "Nick", "Gina"};

		int commonFriends = 0;
		for(int i = 0; i < list1.length; ++i)
		{
			String friend = list1[i];
			boolean isMatch = checkForMatch(friend, list2);
			if(isMatch)
			{
				++commonFriends;
			}
		}
		System.out.println(commonFriends);
	}
	
	public static boolean checkForMatch(String name, String[] list)
	{
		for(int i =0; i < list.length; i++)
                {
                    
                    if(list[i].equals(name))
                    {
                        boolean x = true;
                        
                        return x;                    
                    
                    }
                    
                }
                return false;            
                
                //Loop through the friends in list
		//For each friend in list, check if it equals the input
		//parameter name.
		//Return true or false accordingly
        }    
}
//michael and brevan 
