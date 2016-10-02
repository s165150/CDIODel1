public class Main {

		public static void main(String[] args) 
		{
			
			
			Game start = new Game();
			int count = (int) (Math.random()*101+1);
			start.start();
			Players p1 = null, p2 = null;
			
			
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