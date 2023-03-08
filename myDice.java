import java.util.*;

public class myDice
{
    // instant variable to set maximum face value

    int faceValue;

   //constructor
	public myDice() {
		this.faceValue = 0;
	}
   
   //To generate random number/roll
    public void roll()
    {
    	 Random ran = new Random();
    	 faceValue = ran.nextInt(7);
    }

   //To return the value
    public int getFaceValue()
    {
    	return faceValue;
    }
    
    public static void main(String[] args) {
    	
    	myDice dice = new myDice();
    	dice.roll();
    	System.out.println("You get: " + dice.faceValue + " in this round");
    	//System.out.println("You get: " + dice.getFaceValue() + " in this round");
    }
   
}
