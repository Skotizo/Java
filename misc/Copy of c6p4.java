/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author unco
 */
public class c6p4 
{
    public static void main(String[]args)
    {
        int[] list = {8,1,5,7,12,16,19,20,17,22};
        System.out.println("A)");
        for(int i = 0 ; i < list.length; i++)
        {
            System.out.print(list[i] + ",");
            
        }
        System.out.println();
        System.out.println( "B)");
        for(int i = 0 ; i < list.length; i++)
        if(list[i] % 2 == 0)
            {
                System.out.print(list[i] + ",");
            }
        System.out.println();
        System.out.println("C)");
        for(int i = list.length -1 ; i >=0; i--)
        {
            System.out.print(list[i] +",");
        }
        System.out.println();
        System.out.println("D)");
        System.out.print(list.length -1 + ",");
        System.out.print(list[0]);
            
        
    }
}
