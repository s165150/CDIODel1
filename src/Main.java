import desktop_resources.GUI;
public class Main {

		public static void main(String[] args) 
		{
			
			Game startGame = new Game();
			GUI.setDice(4, 4);
			int turnCount = (int) (Math.random()*101+1);
			startGame.start();
		
			
			while(turnCount > 50)
			{
				startGame.player1();
				startGame.player2();
				turnCount++;
			}	
			
			while(turnCount < 50)
			{
				startGame.player2();
				startGame.player1();
				turnCount--;
			}
			
			
		}
}