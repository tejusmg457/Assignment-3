import java.util.Scanner;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}	
}

class Player
{
	int guessNum1;
	int guessNum1()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player1 kindly guess the number");
		guessNum1=scan.nextInt();
		return guessNum1;
	}
	
	int guessNum2;
	int guessNum2()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player2 kindly guess the number");
		guessNum2=scan.nextInt();
		return guessNum2;
	}	
	
	int guessNum3;
	int guessNum3()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player3 kindly guess the number");
		guessNum3=scan.nextInt();
		return guessNum3;
	}	
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum1();
		numFromPlayer2=p2.guessNum2();
		numFromPlayer3=p3.guessNum3();
	}
	
	void comparison()
	{
		{
			if(numFromGuesser != numFromPlayer1)
			{
			 if (((numFromGuesser-10) <= numFromPlayer1) && (numFromPlayer1 <= (numFromGuesser+10)))
					{
				 		System.out.println("Player 1 you guessed number nearer to the gusser guessed number and you have one more chance");
					 		Scanner scan=new Scanner(System.in);	
					 		System.out.println("Player1 kindly reguess the number");
							int guess11=scan.nextInt();
							numFromPlayer1=guess11;
					}		
			else 
					{
						System.out.print("");
					}
			}
		}
		
		
		{
			if(numFromGuesser != numFromPlayer2)
			{
			 if (((numFromGuesser-10) <= numFromPlayer2) && (numFromPlayer2 <= (numFromGuesser+10)))
					{
				 		System.out.println("Player2 you guessed number nearer to the gusser guessed number and you have one more chance");
							Scanner scan=new Scanner(System.in);	
					 		System.out.println("Player2 kindly reguess the number");
							int guess22=scan.nextInt();
							numFromPlayer2=guess22;
					}
			else 
					{
						System.out.print("");
					}
			}
		}
		
		{
			if(numFromGuesser != numFromPlayer3)
			{
			 if (((numFromGuesser-10) <= numFromPlayer3) && (numFromPlayer3 <= (numFromGuesser+10)))
					{
				 		System.out.println("Player3 you guessed number nearer to the gusser guessed number and you have one more chance");
							Scanner scan=new Scanner(System.in);	
					 		System.out.println("Player3 kindly reguess the number");
							int guess33=scan.nextInt();
							numFromPlayer3=guess33;
					}
			else 
					{
						System.out.print("");
					}
			}
		}
		
	
	}
	
	void result()
	{	
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}

}

public class EnhanceGuesserGame
{

	public static void main(String[] args) 
	{
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.comparison();
		u.result();
	}
}