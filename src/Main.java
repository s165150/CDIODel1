public class Main {

		public static void main(String[] args) 
		{
			
			
			Game start = new Game();
			int count = (int) (Math.random()*2+1);
			start.start();
			
			while(count < 2)
				start.player1();
				
			
			while(count > 1)
				start.player2();
			
			
		}
}