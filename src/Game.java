import java.util.Scanner;

public class Game {

		public static void main(String[] args) 
		{
			
			
			
			Scanner scan = new Scanner(System.in);
			int dice1, dice2;

			int count = (int) (Math.random()*2+1);
			Die die1 = new Die();
			Die die2 = new Die();
			int sum1 = 2;
			int sum2 = 0;
			int sum = 0;
			String s;
			String navn1 = "a";
			String navn2 = "a";
			Players player1 = new Players (1, navn1, sum1);
			Players player2 = new Players (2, navn2, sum2);
			
			System.out.println("Indtast spiller 1's navn:");
			navn1 = player1.getPlayerName(scan.nextLine());
			System.out.println("Indtast spiller 2's navn:");
			navn2 = player2.getPlayerName(scan.nextLine());
			
			
			System.out.println(player1.getSum() + " " + player1.getName());
			System.out.println(player2.getSum() + " " + player2.getName());
			
			
			
			
			
			
			
			
		
			
			while (player1.getSum() < 41 & player2.getSum() < 41)
			{
				
			while (count < 2)
			{
			System.out.println(player1.getName() + " please roll the dies");
			s = scan.nextLine();
			dice1 = die1.roll();
			dice2 = die2.roll();
			sum = dice1 + dice2;
			sum  = player1.points(sum);
			
			System.out.println ("Die One: " + dice1 + ", Die Two: " + dice2);
			System.out.println("Sum of points: " + player1.getSum());
			System.out.println();
			count++;
			}
			if (player1.getSum() > 39)
			{
			break;
			}
			while (count > 1)
			{
				System.out.println(player2.getName() + " please roll the dies");
				s = scan.nextLine();
				dice1 = die1.roll();
				dice2 = die2.roll();
				sum = dice1 + dice2;
				sum  = player2.points(sum);
				
				System.out.println ("Die One: " + dice1 + ", Die Two: " + dice2);
				System.out.println("Sum of points: " + player2.getSum());
				System.out.println();
				count--;
			}
			}
			
			System.out.println("Du vandt");

	}
}

