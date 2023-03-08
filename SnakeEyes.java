public class SnakeEyes
{
	

	public static void main (String[] args)
	{
	
        //create two MyDice objects
		
		myDice dice1 = new myDice();
		dice1.roll();
		
		myDice dice2 = new myDice();
		dice1.roll();
		
		int ROLLS ;
		int count = 0;
	
        //create a loop to run the object by calling roll methods to determine snakeeyes
		
		for(ROLLS = 0; ROLLS<100 ; ROLLS++ ) {
			if (dice1.faceValue == 1 && dice2.faceValue == 1) {
				count++;
			}
		}


		System.out.println ("Number of rolls: " + ROLLS);
		System.out.println ("Number of snake eyes: " + count);
		System.out.println ("Ratio: " + (float)count / ROLLS);
	}
}
