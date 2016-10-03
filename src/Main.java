import desktop_resources.GUI;
public class Main {

		public static void main(String[] args) 
		{
			
			Game start = new Game();
			GUI.setDice(4, 4);
			int count = (int) (Math.random()*101+1);
			start.start();
		
			
			while(count > 50)
			{
				start.player1();
				start.player2();
				count++;
			}	
			
			while(count < 50)
			{
				start.player2();
				start.player1();
				count--;
			}
			
			
		}
}