public class Main {

		public static void main(String[] args) 
		{
			
			
			Game start = new Game();
			int count = (int) (Math.random()*101+1);
			start.start();
			Players p1 = null, p2 = null;
			
			
			while(count > 50)
			{
				start.player(p1);
				start.player(p2);
				count++;
			}	
			
			while(count < 50)
			{
				start.player(p1);
				start.player(p2);
				count--;
			}
			
			
		}
}