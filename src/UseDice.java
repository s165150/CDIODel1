//import java.util.Scanner;
//
//public class UseDice
//{
//
//	public static void main(String[] args) {
//		
//		System.out.println("Welcome to a game of dice");
//		System.out.println("The purpose of this game is to roll 40 points first");
//		System.out.println("This game is designed for 2 people to play");
//		System.out.println("Whose turn it is, will be displayed after each roll");
//		System.out.println("Alright lets get started");
//		
//		
//		Die cup = new Die();   
//		Die cup2 = new Die();
////		String player1;
////		String player2;
//		int a, counter, sum;
//		counter = (int) (Math.random() * 2 + 1);
//		Scanner scan = new Scanner(System.in);
//		
//		scan.nextLine();
//		
//		
//		while(counter<3)
//		{
//			while(counter < 2)
//		{
//				System.out.println();
//				System.out.println("Player 1's turn");
//				System.out.println("Please roll the dice");
//				scan.nextLine();
//				cup.roll();
//				cup2.roll();
//				sum = cup.roll() + cup2.roll();
//				System.out.println("Dice 1: " + cup + " Dice 2: " + cup2);
//				System.out.println("Sum of dice:" + sum );
//				counter++;
//		}
//			while (counter > 1)
//		{	
//				System.out.println();
//				System.out.println("Player 2's turn");
//				System.out.println("Please roll the dice");
//				scan.nextLine();
//				cup.roll();
//				cup2.roll();
//				sum = cup.roll() + cup2.roll();
//				System.out.println("Dice 1: " + cup + " Dice 2: " + cup2);
//				System.out.println("Sum of dice:" + sum );
//				counter--;
//		}
//		
//	
//}}}
