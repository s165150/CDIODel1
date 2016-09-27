import java.util.Scanner;

public class Players {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//The idea is to have a counter check if the number is 1 or 2
		
		System.out.println("Welcome to a game of dice");
		System.out.println("The purpose of this game is to roll 40 points first");
		System.out.println("This game is designed for 2 people to play");
		System.out.println("Whos turn it is, will be displayed after each roll");
		System.out.println("Allright lets get started");
		
		
		String player1;
		String player2;
		int a;
		int counter;
		
		//Here we randomize who is going to start.
		//This is done by having a random number chosen between 1 and 2, 
		//and then have the respective player take their turn
		//Seing that random returns either 0 or 1, 
		//ive added a times 2 to make it either 0 or 1, 
		//and then add the 1 to make it 1 or 2
		counter = (int) (Math.random() * 2 + 1);
				
		//printing the number to be sure we have a correct value from start.
		System.out.println(counter);
		//install scanner to get the a int defined by the user. This is just to make
		//it run something
		Scanner scan = new Scanner(System.in);
		
		/**
		 * I have added the variable a just to make the game run, Here in the beginning
		 * As you can see ive set the variable a = 4, and then set up a while statement
		 * that allows the game to run untill the game finds that a has changed to a value
		 * over the set amount. So here we can change out the a with the point thingy.
		 */
		a = 4;
		while(a < 45)
		{
			//if the counter is then less than 2 (1 in our case) we do the following.
				while(counter < 2)
				{
				System.out.println("Player 1's turn");
				System.out.println("Please roll the dice");
				a = scan.nextInt();
				counter++; //here we add +1 to the counter, to make it do the next loop.
				}
			//if the counter is then higher than 1 (2 in our case) it does the following
		while(counter > 1)
				{
				System.out.println("Player 2's turn");
				System.out.println("Please roll the dice");
				a = scan.nextInt();
				counter--; //here we subtract -1 to the counter, to make it do the first loop.
				}
		}
		
	}

}
