/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author unco
 */
public class c6p2 
{
    public static void main(String[]args)
    {
       
       int[] scores = {17,12,8,22,21,13,18};
       int largest =scores[0];
       for(int i =0; i < scores.length; i++)
       {
           
           if(scores[i] > largest)
           {
               largest = scores[i];
           }
           
           
       }
       System.out.println(largest);
    }
    //michael and brevan 
    
}
