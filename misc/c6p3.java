/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author unco
 */
import java.util.Scanner;
public class c6p3 

{
    public static void main(String[]args)
    {
        System.out.println("Enter in four test scores to get the average.");
        Scanner intake = new Scanner(System.in);
        int[] numbers = new int[4];
        for(int i =0; i < numbers.length; i++)
        {
            numbers[i] = intake.nextInt();
            
        }
        double total = numbers[0] + numbers[1] + numbers[2] + numbers[3];
        total = total/4;
        System.out.println(total);
    }
}
