package exercises;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PythagoreanTheorum 
{

	public static void main(String[] args) 
	{
		double sideA,sideB,sideC;
		
		Scanner input = new Scanner(System.in);
		String sideChoiceString = null;
		
		System.out.println(" Trying to solve a right triangle Huh? \nPlease enter which side your trying to solve for>>> \nA>\nB>\nC>");
		sideChoiceString = input.nextLine();

		if(sideChoiceString.equalsIgnoreCase("A"));
		{
			
			System.out.print("Please enter side B>>>");
			sideB = input.nextDouble();
			System.out.print("Please enter side C>>>");
			sideC = input.nextDouble();
			sideA = Math.sqrt(sideC) - Math.sqrt(sideB);
			
			System.out.println("Side A is " + sideA);
			
			System.out.println("Side B is " + sideB);
			
			System.out.println("Side C is " + sideC);
			
		}
		if(sideChoiceString.equalsIgnoreCase("B>>>"));
		{
			
			System.out.print("Please enter side A>>>");
			sideA = input.nextDouble();
			System.out.print("Please enter side C>>>");
			sideC = input.nextDouble();
			sideB = Math.sqrt(sideC) - Math.sqrt(sideA);
			
			System.out.println("Side A is " + sideA);
			
			System.out.println("Side B is " + sideB);
			
			System.out.println("Side C is " + sideC);
		}	
	}

}
