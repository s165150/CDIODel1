import java.util.Scanner;

public class Game {

		public static void main(String[] args) 
		{
			
			
			
			Scanner scan = new Scanner(System.in);
			int count = (int) (Math.random()*2+1);

			int sum = 0;
			String roll;
			String name1 = "a";
			String name2 = "a";
			Raffle cup = new Raffle (0, 0, 0);
			Players p1 = new Players (1, name1, cup.setScore());
			Players p2 = new Players (2, name2, cup.setScore());
			
			
			System.out.println("Indtast spiller 1's navn:");
			name1 = p1.setPlayerName(scan.nextLine());
			System.out.println("Indtast spiller 2's navn:");
			name2 = p2.setPlayerName(scan.nextLine());
			
			
			System.out.println(p1.getPlayerScore() + " " + p1.getPlayerName());
			System.out.println(p2.getPlayerScore() + " " + p2.getPlayerName());
			
			while (p1.getPlayerScore() < 40 & p2.getPlayerScore() < 40)
			{
				
			while (count < 2)
			{
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.println(p1.getPlayerName() + " please roll the dies");
			roll = scan.nextLine();
			cup.setDice1();
			cup.setDice2();
			cup.setScore();
			p1.setPlayerScore(cup.setScore());
			if (sum == 2)
			{
				p1.resetPlayerScore();
			}
			
			System.out.println ("Die One: " + cup.getDice1() + ", Die Two: " + cup.getDice2());
			System.out.println("Sum of points: " + p1.getPlayerScore());
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			System.out.flush();
			count++;
			}
			if (p1.getPlayerScore() > 39)
			{
			break;
			}
			while (count > 1)
			{
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.println(p2.getPlayerName() + " please roll the dies");
				roll = scan.nextLine();
				cup.setDice1();
				cup.setDice2();
				cup.setScore();
				p2.setPlayerScore(cup.setScore());
				if (sum == 2)
				{
					p2.resetPlayerScore();
				}
				
				System.out.println ("Die One: " + cup.getDice1() + ", Die Two: " + cup.getDice2());
				System.out.println("Sum of points: " + p2.getPlayerScore());
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.flush();
				count--;
			}
			}
			
			System.out.println("Du vandt");

	}
}

