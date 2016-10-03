import java.util.Scanner;

public class UseDice
{
	public static void main(String[] args) {
		
		int turn, sum, points1, points2;
		Die die1, die2;
		turn = (int) (Math.random() * 2 + 1);
		Scanner scan = new Scanner(System.in);
		die1 = new Die();
		die2 = new Die();
		points1 = 0;
		points2 = 0;
		
		
		
		System.out.println("Welcome to the dice rolling game.");
		System.out.println("The objective of the game is to become"
				+ " the first player to reach 40 points.");
		System.out.println("Press enter twice to start...");
		
		scan.nextLine();
		
		
		
		while(turn<3)
		{
			while(turn == 1)
		{
				scan.nextLine();
				System.out.println();
				System.out.println("Player 1's turn");
				System.out.println("Please press enter to roll the dice");
				scan.nextLine();
				die1.roll();
				die2.roll();
				sum = die1.roll() + die2.roll();
				System.out.println("[" + die1 + "]" + " & " + "[" + die2 + "]");
				System.out.println("Sum of dice: " + sum );
				points1 = points1+sum;
				if (sum == 2){
					points1 = 0;}
				System.out.println("Amount of points for player 1: " + points1);
				
				if (points1 >= 40){
					turn=turn+2;
					}
				if (die1==die2){
					turn--; break;}
				turn++;
		}
			while (turn == 2)
		{	
				scan.nextLine();
				System.out.println();
				System.out.println("Player 2's turn");
				System.out.println("Please press enter to roll the dice");
				scan.nextLine();
				die1.roll();
				die2.roll();
				sum = die1.roll() + die2.roll();
				System.out.println("[" + die1 + "]" + " & " + "[" + die2 + "]");
				System.out.println("Sum of dice: " + sum );
				points2 = points2+sum;
				if (sum == 2){
					points2 = 0;}
				System.out.println("Amount of points for player 2: " + points2);
				if (die1==die2){
					turn++; break;}
				if (points2 >= 40){
					turn=turn+2;
					}
				turn--;
		}
		}
	if (points1 >= 40){
		System.out.println("Congratulations player 1, you've won!");}
		
	if (points2 >= 40){
	 System.out.println("Congratulations player 2, you've won!");}
		
	scan.close();
	
}}
