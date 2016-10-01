import java.util.Scanner;

public class Game {

		public static void main(String[] args) 
		{
			
			
			
			Scanner scan = new Scanner(System.in);
			int dice1, dice2;

			int count = (int) (Math.random()*2+1);
			Die die1 = new Die();
			Die die2 = new Die();
//			Raffle cup = new Raffle();
			int sum1 = 0;
			int sum2 = 0;
			int sum = 0;
			String s;
			String navn1 = "a";
			String navn2 = "a";
			Players player1 = new Players (1, navn1, sum1);
			Players player2 = new Players (2, navn2, sum2);
			Raffle cup = new Raffle (1, 2, 3);
			
			
			
			System.out.println("Indtast spiller 1's navn:");
			navn1 = player1.setPlayerName(scan.nextLine());
			System.out.println("Indtast spiller 2's navn:");
			navn2 = player2.setPlayerName(scan.nextLine());
			
			
			System.out.println(player1.getPlayerScore() + " " + player1.getPlayerName());
			System.out.println(player2.getPlayerScore() + " " + player2.getPlayerName());
			
			
			
			
			
			
			
			
		
			
			while (player1.getPlayerScore() < 40 & player2.getPlayerScore() < 40)
			{
				
			while (count < 2)
			{
			System.out.println(player1.getPlayerName() + " please roll the dies");
			s = scan.nextLine();
			cup.setDice1();
			cup.setDice2();
			cup.setScore();
			player1.setPlayerScore(cup.setScore());
			if (sum == 2)
			{
				player1.resetPlayerScore();
			}
			
			System.out.println ("Die One: " + cup.getScore() + ", Die Two: " + cup.getScore());
			System.out.println("Sum of points: " + player1.getPlayerScore());
			System.out.println();
			count++;
			}
			if (player1.getPlayerScore() > 39)
			{
			break;
			}
			while (count > 1)
			{
				System.out.println(player2.getPlayerName() + " please roll the dies");
				s = scan.nextLine();
				cup.setDice1();
				cup.setDice2();
				cup.setScore();
				player2.setPlayerScore(cup.setScore());
				if (sum == 2)
				{
					player2.resetPlayerScore();
				}
				
				System.out.println ("Die One: " + cup.getDice1() + ", Die Two: " + cup.getDice2());
				System.out.println("Sum of points: " + player2.getPlayerScore());
				System.out.println();
				count--;
			}
			}
			
			System.out.println("Du vandt");

	}
}

