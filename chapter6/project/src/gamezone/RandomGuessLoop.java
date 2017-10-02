package gamezone;

import javax.swing.JOptionPane;

public class RandomGuessLoop 
{

	public static void main(String[] args) 
	{
	

		displayRunGame();
		
	
		
	}
	public static void displayRunGame()
	{
		
		int guess;
		int result;
		String resultString;
		String msg;
		int low = 1;
		int high = 100;
		
		int score = 10;
		result = low + (int)(Math.random() * high);
	do {
		
		resultString = JOptionPane.showInputDialog(null, "Try to guess my number between " + low + " and " + high);
		guess = Integer.parseInt(resultString);
		score--;
		if(guess==result)
		{
			msg = "you win ";
		}
		else
			if(guess<result)
			{
				msg = "Your guess was too low ";
				
			}
			else
				msg = "Your guess was to high";
		
		JOptionPane.showMessageDialog(null, msg + "Your score was " + score);
			
				}while(guess != result);
	
			}
	}
